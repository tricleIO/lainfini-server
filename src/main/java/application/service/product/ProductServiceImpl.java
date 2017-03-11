package application.service.product;

import application.persistence.entity.Category;
import application.persistence.entity.Product;
import application.persistence.entity.ProductHasCallToAction;
import application.persistence.entity.ProductHasFlash;
import application.persistence.repository.*;
import application.rest.domain.*;
import application.service.BaseSoftDeletableDatabaseServiceImpl;
import application.service.flash.FlashService;
import application.service.material.MaterialService;
import application.service.response.ServiceResponse;
import application.service.response.ServiceResponseStatus;
import application.service.size.SizeService;
import application.service.unit.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.security.Principal;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

// @TODO - refactor this class, eventually add generic support for secured services

@Service
public class ProductServiceImpl extends BaseSoftDeletableDatabaseServiceImpl<Product, Long, ProductRepository, ProductDTO> implements ProductService {

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
    private UserLikesProductRepository userLikesProductRepository;

    @Autowired
    private MaterialService materialService;

    @Autowired
    private SizeService sizeService;

    @Autowired
    private UnitService unitService;

    private Random random = new Random();

    @Override
    public ServiceResponse<ProductDTO> read(Long key, Principal principal) {
        ServiceResponse<ProductDTO> response = super.read(key);
        if (response.isSuccessful()) {
            ProductDTO productDTO = response.getBody();
            if (principal != null) {
                if (userLikesProduct(principal.getName(), productDTO)) {
                    productDTO.setIsFavourite(true);
                }
            }
        }
        return response;
    }

    @Override
    public ServiceResponse<Page<ProductDTO>> readAll(Pageable pageable, Principal principal) {
        ServiceResponse<Page<ProductDTO>> response = super.readAll(pageable);
        if (principal != null) {
            for (ProductDTO productDTO : response.getBody().getContent()) {
                if (userLikesProduct(principal.getName(), productDTO)) {
                    productDTO.setIsFavourite(true);
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
            for (ProductDTO productDTO : pageWithDtos.getContent()) {
                if (userLikesProduct(principal.getName(), productDTO)) {
                    productDTO.setIsFavourite(true);
                }
            }
        }

        return ServiceResponse.success(
                pageWithDtos
        );
    }

    @Override
    public ServiceResponse<ProductDTO> create(ProductDTO productDTO) {
        // add material
        if (productDTO.getMaterialUid() != null) {
            ServiceResponse<MaterialDTO> materialResponse = materialService.read(
                    productDTO.getMaterialUid()
            );
            if (!materialResponse.isSuccessful()) {
                return ServiceResponse.error(ServiceResponseStatus.MATERIAL_NOT_FOUND);
            }
            productDTO.setMaterial(materialResponse.getBody());
        }
        // add size
        if (productDTO.getSizeUid() != null) {
            ServiceResponse<SizeDTO> sizeResponse = sizeService.read(
                    productDTO.getSizeUid()
            );
            if (!sizeResponse.isSuccessful()) {
                return ServiceResponse.error(ServiceResponseStatus.SIZE_NOT_FOUND);
            }
            productDTO.setSize(sizeResponse.getBody());
        }
        // add unit
        if (productDTO.getUnitUid() != null) {
            ServiceResponse<UnitDTO> unitResponse = unitService.read(
                    productDTO.getUnitUid()
            );
            if (!unitResponse.isSuccessful()) {
                return ServiceResponse.error(ServiceResponseStatus.UNIT_NOT_FOUND);
            }
            productDTO.setUnit(unitResponse.getBody());
        }

        if (productDTO.getUrlSlug() == null) {
            productDTO.setUrlSlug(productDTO.getName().replaceAll("\\s+","-").toLowerCase());
        }
        return super.create(productDTO);
    }

    private boolean userLikesProduct(String username, ProductDTO productDTO) {
        return userLikesProductRepository.countByUserLoginAndProductId(username, productDTO.getUid()) > 0;
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

    private List<Integer> getCategoryAndAllSubcategoriesIds(Integer categoryId) {
        // @TODO - think about memory and query optimization
        List<Integer> categoryIds = new LinkedList<>();
        categoryIds.add(categoryId);

        // by queue mechanism add all subcategory ids
        Queue<Category> categoryQueue = new LinkedList<>();
        categoryQueue.addAll(categoryRepository.findByParentId(categoryId));
        while (!categoryQueue.isEmpty()) {
            Category currentCategory = categoryQueue.remove();
            categoryIds.add(currentCategory.getId());
            // add all subcategories of current category to queue
            categoryQueue.addAll(categoryRepository.findByParentId(currentCategory.getId()));
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

    @Override
    public ProductRepository getRepository() {
        return productRepository;
    }

}
