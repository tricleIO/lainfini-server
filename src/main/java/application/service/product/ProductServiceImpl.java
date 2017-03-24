package application.service.product;

import application.persistence.entity.*;
import application.persistence.repository.*;
import application.persistence.type.UserStatusEnum;
import application.rest.domain.FlashDTO;
import application.rest.domain.ProductDTO;
import application.rest.domain.ProductHasFlashDTO;
import application.service.AdditionalDataManipulator;
import application.service.AdditionalDataManipulatorBatch;
import application.service.BaseSoftDeletableDatabaseServiceImpl;
import application.service.category.CategoryService;
import application.service.flash.FlashService;
import application.service.material.MaterialService;
import application.service.response.ServiceResponse;
import application.service.response.ServiceResponseStatus;
import application.service.size.SizeService;
import application.service.unit.UnitService;
import application.util.SlugMaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.security.Principal;
import java.util.*;

// @TODO - refactor this class, eventually add generic support for secured services

@Service
public class ProductServiceImpl extends BaseSoftDeletableDatabaseServiceImpl<Product, UUID, ProductRepository, ProductDTO> implements ProductService {


    @Autowired
    private ApplicationFileRepository applicationFileRepository;

    @Override
    public ServiceResponse<ProductDTO> read(String slug) {
        Product product = productRepository.findOneBySlug(slug);
        if (product == null) {
            return ServiceResponse.error(ServiceResponseStatus.PRODUCT_SLUG_NOT_FOUND);
        }
        return ServiceResponse.success(product.toDTO(true));
    }

    @Override
    public ServiceResponse<ProductDTO> read(UUID key, Principal principal) {
        ServiceResponse<ProductDTO> response = super.read(key);
        if (response.isSuccessful()) {
            ProductDTO productDTO = response.getBody();
            if (principal != null) {
                User user = userRepository.findByLoginAndRegisterStatus(
                        principal.getName(), UserStatusEnum.REGISTERED
                );
                if (user != null) {
                    if (userLikesProduct(user, productDTO)) {
                        productDTO.setIsFavourite(true);
                    }
                }
            }
        }
        return response;
    }

    @Override
    public ServiceResponse<Page<ProductDTO>> readAll(Pageable pageable, Principal principal) {
        ServiceResponse<Page<ProductDTO>> response = super.readAll(pageable);
        if (principal != null) {
            if (principal != null) {
                User user = userRepository.findByLoginAndRegisterStatus(
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
            User user = userRepository.findByLoginAndRegisterStatus(
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
    }


    // additional data manipulators

    @Override
    protected AdditionalDataManipulatorBatch<ProductDTO> getAdditionalDataLoaderBatch(ProductDTO productDTO) {
        AdditionalDataManipulatorBatch<ProductDTO> dataManipulatorBatch = new AdditionalDataManipulatorBatch<>(productDTO);
        dataManipulatorBatch.add(this::getCategoryDataManipulator);
        dataManipulatorBatch.add(this::getMaterialDataManipulator);
        dataManipulatorBatch.add(this::getSizeDataManipulator);
        dataManipulatorBatch.add(this::getUnitDataManipulator);
        return dataManipulatorBatch;
    }

    @Override
    protected ServiceResponse<ProductDTO> doBeforeConvertInCreate(ProductDTO productDTO) {
        // if url slug is null, generate it from name
        if (productDTO.getSlug() == null) {
            productDTO.setSlug(
                    getSlugFromString(productDTO.getName())
            );
        } else {
            productDTO.setSlug(
                    getSlugFromString(productDTO.getSlug())
            );
        }
        return super.doBeforeConvertInCreate(productDTO);
    }

    // privates

    private boolean userLikesProduct(User user, ProductDTO productDTO) {
        Wish wish = new Wish();
        wish.setCustomer(user);
        Product product = new Product();
        product.setId(productDTO.getUid());
        wish.setProduct(product);
        return user.getWishes().contains(wish);
    }

    private String getSlugFromString(String string) {
        return SlugMaker.getSlugFromString(string, productRepository);
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

    private void addRandomCallToAction(ProductDTO product) {
        if (productHasCallToActionRepository.countByProductId(product.getUid()) > 0) {
            List<ProductHasCallToAction> productHasCallToAction = productHasCallToActionRepository.findByProductId(product.getUid());
            int index = random.nextInt(productHasCallToAction.size());
            ProductHasCallToAction randomProductHasCallToAction = productHasCallToAction.get(index);
            product.setCall(randomProductHasCallToAction.getCallToAction().toDTO(false));
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

}
