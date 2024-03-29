package application.service.product;

import application.persistence.entity.*;
import application.persistence.repository.*;
import application.persistence.type.ProductStatusEnum;
import application.persistence.type.StatusEnum;
import application.persistence.type.UserStatusEnum;
import application.rest.domain.*;
import application.service.AdditionalDataManipulator;
import application.service.AdditionalDataManipulatorBatch;
import application.service.BaseSoftDeletableDatabaseServiceImpl;
import application.service.category.CategoryService;
import application.service.flash.FlashService;
import application.service.material.MaterialService;
import application.service.productDesign.ProductDesignService;
import application.service.response.ServiceResponse;
import application.service.response.ServiceResponseStatus;
import application.service.size.SizeService;
import application.service.stock.StockService;
import application.service.stockItem.StockItemService;
import application.service.technology.TechnologyService;
import application.service.unit.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.security.Principal;
import java.util.*;

// @TODO - refactor this class, eventually add generic support for secured services

@Service
public class ProductServiceImpl extends BaseSoftDeletableDatabaseServiceImpl<Product, UUID, ProductRepository, ProductDTO>
        implements ProductService {

    @Autowired
    private ApplicationFileRepository applicationFileRepository;

    @Autowired
    private StockItemService stockItemService;

    @Autowired
    private StockService stockService;

    @Override
    protected ServiceResponse<ProductDTO> doBeforeConvertInCreate(ProductDTO dto) {
        if (dto.getSerialNumberIsRequired() == null) {
            dto.setSerialNumberIsRequired(false);
        }
        return super.doBeforeConvertInCreate(dto);
    }

    @Override
    public ServiceResponse<ProductDTO> readBySlug(String slug) {
        Product result = productRepository.findOneBySlug(slug);
        if (result == null) {
            return ServiceResponse.error(ServiceResponseStatus.NOT_FOUND);
        }
        ProductDTO dto = result.toDTO(true);
        additionalUpdateDto(dto);
        return ServiceResponse.success(dto);
    }

    @Override
    public ServiceResponse<ProductDTO> read(UUID key, Principal principal) {
        ServiceResponse<ProductDTO> response = super.read(key);
        if (response.isSuccessful()) {
            ProductDTO productDTO = response.getBody();
            if (principal != null) {
                User user = userRepository.findByEmailAndRegisterStatus(
                        principal.getName(), UserStatusEnum.REGISTERED
                );
                if (user != null) {
                    if (userLikesProduct(user, productDTO)) {
                        productDTO.setIsFavourite(true);
                    }
                }
            }
//            addCallToAction(productDTO);
        }
        return response;
    }

    @Override
    public ServiceResponse<Page<ProductDTO>> readAll(Pageable pageable, Principal principal) {
        ServiceResponse<Page<ProductDTO>> response = super.readAll(pageable);
        if (principal != null) {
            if (principal != null) {
                User user = userRepository.findByEmailAndRegisterStatus(
                        principal.getName(), UserStatusEnum.REGISTERED
                );
                if (user != null) {
                    for (ProductDTO productDTO : response.getBody().getContent()) {
                        if (userLikesProduct(user, productDTO)) {
                            productDTO.setIsFavourite(true);
                        }
                    }
                }
            }
        }
        return response;
    }

    @Override
    public ServiceResponse<Page<ProductDTO>> readProductsInCategoryAndSubcategories(Integer categoryId, Pageable pageable, Principal principal) {
        List<Integer> categoryIds = getCategoryAndAllSubcategoriesIds(categoryId);
        Page<Product> pageWithProducts = productRepository.findByCategoryIdIn(categoryIds, pageable);
        Page<ProductDTO> pageWithDtos = convertPageWithEntitiesToPageWithDtos(pageWithProducts, pageable);

        if (principal != null) {
            User user = userRepository.findByEmailAndRegisterStatus(
                    principal.getName(), UserStatusEnum.REGISTERED
            );
            if (user != null) {
                for (ProductDTO productDTO : pageWithDtos.getContent()) {
                    if (userLikesProduct(user, productDTO)) {
                        productDTO.setIsFavourite(true);
                    }
                }
            }
        }

        return ServiceResponse.success(
                pageWithDtos
        );
    }

    @Override
    public ServiceResponse<ProductDTO> addFlash(ProductHasFlashDTO productHasFlashDTO) {
        if (productHasFlashRepository.countByProductIdAndFlashId(
                productHasFlashDTO.getProductUid(), productHasFlashDTO.getFlashUid()) == 0) {

            ServiceResponse<FlashDTO> flashResponse = flashService.read(productHasFlashDTO.getFlashUid());
            if (!flashResponse.isSuccessful()) {
                return ServiceResponse.error(ServiceResponseStatus.NOT_FOUND);
            }
            ServiceResponse<ProductDTO> productResponse = read(productHasFlashDTO.getProductUid());
            if (!productResponse.isSuccessful()) {
                return ServiceResponse.error(ServiceResponseStatus.NOT_FOUND);
            }

            ProductHasFlash productHasFlash = new ProductHasFlash();
            productHasFlash.setFlash(flashResponse.getBody().toEntity(false));
            productHasFlash.setProduct(productResponse.getBody().toEntity(false));
            productHasFlashRepository.save(productHasFlash);
        }

        // load updated product
        return read(productHasFlashDTO.getProductUid());
    }

    @Override
    public ServiceResponse<Page<ProductDTO>> findByImagesPfFileId(Long imageId) {
        ApplicationFile one = applicationFileRepository.findOne(imageId);
        Set<ProductFile> productFiles = one.getProductFiles();
        List<ProductDTO> productDTOS = new ArrayList<>();
        for (ProductFile productFile : productFiles) {
            productDTOS.add(productFile.getPf().getProduct().toDTO(false));
        }
        return ServiceResponse.success(new PageImpl<ProductDTO>(productDTOS, null, productDTOS.size()));
    }

    @Override
    public ServiceResponse<LocalProductAvailabilityDTO> readProductAvailability(UUID productId) {
        ServiceResponse<ProductDTO> productResponse = read(productId);
        if (!productResponse.isSuccessful()) {
            return ServiceResponse.error(productResponse.getStatus());
        }
        ServiceResponse<Page<StockItemDTO>> itemsResponse = stockItemService.readProductStockedItems(productId, null);
        if (!itemsResponse.isSuccessful()) {
            return ServiceResponse.error(itemsResponse.getStatus());
        }
        Map<Integer, Long> stockProductQuantityMap = new HashMap<>();
        for (StockItemDTO item : itemsResponse.getBody().getContent()) {
            if (stockProductQuantityMap.containsKey(item.getStockUid())) {
                Long quantity = stockProductQuantityMap.get(item.getStockUid());
                quantity++;
                stockProductQuantityMap.replace(item.getStockUid(), quantity);
            } else {
                stockProductQuantityMap.put(item.getStockUid(), 1L);
            }
        }
        List<StockProductQuantityDTO> stocks = new LinkedList<>();
        for (Integer stockId : stockProductQuantityMap.keySet()) {
            StockProductQuantityDTO stock = new StockProductQuantityDTO();
            stock.setUid(stockId);
            ServiceResponse<StockDTO> stockResponse = stockService.read(stockId);
            if (!stockResponse.isSuccessful()) {
                return ServiceResponse.error(ServiceResponseStatus.INTERNAL_ERROR);
            }
            stock.setLocation(stockResponse.getBody().getLocation());
            stock.setQuantity(stockProductQuantityMap.get(stockId));
            stocks.add(stock);
        }
        LocalProductAvailabilityDTO productAvailabilityDTO = new LocalProductAvailabilityDTO();
        productAvailabilityDTO.setProductUid(productId);
        productAvailabilityDTO.setStocks(stocks);
        productAvailabilityDTO.setStatus(productResponse.getBody().getProductAvailability());
        return ServiceResponse.success(productAvailabilityDTO);
    }

    @Override
    public ProductRepository getRepository() {
        return productRepository;
    }

    // overrides protected methods

    @Override
    protected void additionalUpdateDto(ProductDTO dto) {
        super.additionalUpdateDto(dto);
        // addRandomCallToAction(dto);
        if (productHasFlashRepository.countByProductId(dto.getUid()) > 0) {
            List<ProductHasFlash> productHasFlashList = productHasFlashRepository.findByProductId(dto.getUid());
            List<FlashDTO> flashDTOList = new LinkedList<>();
            for (ProductHasFlash productHasFlash : productHasFlashList) {
                flashDTOList.add(productHasFlash.getFlash().toDTO(false));
            }
            dto.setFlashes(flashDTOList);
        }
        // count available item
        ServiceResponse<Long> countAvailableProductItems = stockItemService.countProductsInStock(
                dto.getUid()
        );
        if (countAvailableProductItems.isSuccessful()) {
            Long productCountInStock = countAvailableProductItems.getBody();
            dto.setProductStock(
                    productCountInStock
            );
            dto.setProductAvailability(
                    ProductStatusEnum.getProductStatus(productCountInStock)
            );
        }
        addCallToAction(dto);
    }


    // additional data manipulators

    @Override
    protected AdditionalDataManipulatorBatch<ProductDTO> getAdditionalDataLoaderBatch(ProductDTO productDTO) {
        AdditionalDataManipulatorBatch<ProductDTO> dataManipulatorBatch = new AdditionalDataManipulatorBatch<>(productDTO);
        dataManipulatorBatch.add(this::getCategoryDataManipulator);
        dataManipulatorBatch.add(this::getMaterialDataManipulator);
        dataManipulatorBatch.add(this::getSizeDataManipulator);
        dataManipulatorBatch.add(this::getUnitDataManipulator);
        dataManipulatorBatch.add(p -> new AdditionalDataManipulator<>(
                new AdditionalDataManipulator.Reader<>(p.getTechnologyUid(), technologyService::read),
                new AdditionalDataManipulator.Writer<>(p::setTechnology),
                ServiceResponseStatus.TECHNOLOGY_NOT_FOUND
        ));
        dataManipulatorBatch.add(p -> new AdditionalDataManipulator<>(
                new AdditionalDataManipulator.Reader<>(p.getDesignUid(), productDesignService::read),
                new AdditionalDataManipulator.Writer<>(p::setDesign),
                ServiceResponseStatus.DESIGN_NOT_FOUND
        ));
        return dataManipulatorBatch;
    }


    // privates

    private boolean userLikesProduct(User user, ProductDTO productDTO) {
        for (Wish currentWish : user.getWishes()) {
            if (currentWish.getProduct().getId().equals(productDTO.getUid()) && currentWish.getStatus() == StatusEnum.ACTIVE) {
                return true;
            }
        }
        return false;
    }

    private List<Integer> getCategoryAndAllSubcategoriesIds(Integer categoryId) {
        // @TODO - think about memory and query optimization
        List<Integer> categoryIds = new LinkedList<>();
        categoryIds.add(categoryId);

        // by queue mechanism add all subcategory ids
        Queue<Category> categoryQueue = new LinkedList<>();
        categoryQueue.addAll(categoryRepository.findByParentCategoryId(categoryId));
        while (!categoryQueue.isEmpty()) {
            Category currentCategory = categoryQueue.remove();
            categoryIds.add(currentCategory.getId());
            // add all subcategories of current getCategoryDataManipulator to queue
            categoryQueue.addAll(categoryRepository.findByParentCategoryId(currentCategory.getId()));
        }

        return categoryIds;
    }

    private void addCallToAction(ProductDTO productDTO) {
        Long made = stockItemService.countAllTimeStockedProducts(productDTO.getUid()).getBody();
        Long sold = stockItemService.countAllTimeSoldItems(productDTO.getUid()).getBody();
        if (made > 0) {
            if (sold != made) {
                double ratio = (made - sold) / (double) made;
                if (ratio < 0.6) {
                    GoodTasteCallDTO soldItemsCallDTO = new GoodTasteCallDTO();
                    soldItemsCallDTO.setMade(made);
                    soldItemsCallDTO.setSold(sold);
                    productDTO.setCall(soldItemsCallDTO);
                } else {
                    HurryUpCallDTO hurryUpCallDTO = new HurryUpCallDTO();
                    hurryUpCallDTO.setMade(made);
                    productDTO.setCall(hurryUpCallDTO);
                }
            } else {
                AllGoneCallDTO allGoneCallDTO = new AllGoneCallDTO();
                allGoneCallDTO.setMade(made);
                productDTO.setCall(allGoneCallDTO);
            }
        } else {
            ConceptCallDTO conceptCallDTO = new ConceptCallDTO();
            productDTO.setCall(conceptCallDTO);
        }
    }

    // data manipulators

    private AdditionalDataManipulator getCategoryDataManipulator(ProductDTO productDTO) {
        return new AdditionalDataManipulator<>(
                new AdditionalDataManipulator.Reader<>(productDTO.getCategoryUid(), categoryService::read),
                new AdditionalDataManipulator.Writer<>(productDTO::setCategory),
                ServiceResponseStatus.CATEGORY_NOT_FOUND
        );
    }

    private AdditionalDataManipulator getMaterialDataManipulator(ProductDTO productDTO) {
        return new AdditionalDataManipulator<>(
                new AdditionalDataManipulator.Reader<>(productDTO.getMaterialUid(), materialService::read),
                new AdditionalDataManipulator.Writer<>(productDTO::setMaterial),
                ServiceResponseStatus.MATERIAL_NOT_FOUND
        );
    }

    private AdditionalDataManipulator getSizeDataManipulator(ProductDTO productDTO) {
        return new AdditionalDataManipulator<>(
                new AdditionalDataManipulator.Reader<>(productDTO.getSizeUid(), sizeService::read),
                new AdditionalDataManipulator.Writer<>(productDTO::setSize),
                ServiceResponseStatus.SIZE_NOT_FOUND
        );
    }

    private AdditionalDataManipulator getUnitDataManipulator(ProductDTO productDTO) {
        return new AdditionalDataManipulator<>(
                new AdditionalDataManipulator.Reader<>(productDTO.getUnitUid(), unitService::read),
                new AdditionalDataManipulator.Writer<>(productDTO::setUnit),
                ServiceResponseStatus.UNIT_NOT_FOUND
        );
    }

    // random for call to action
    private Random random = new Random();

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductHasCallToActionRepository productHasCallToActionRepository;

    @Autowired
    private ProductHasFlashRepository productHasFlashRepository;

    @Autowired
    private FlashService flashService;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private MaterialService materialService;

    @Autowired
    private SizeService sizeService;

    @Autowired
    private UnitService unitService;

    @Autowired
    private TechnologyService technologyService;

    @Autowired
    private ProductDesignService productDesignService;

}
