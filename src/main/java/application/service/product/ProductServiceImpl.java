package application.service.product;

import application.persistence.entity.Category;
import application.persistence.entity.Product;
import application.persistence.entity.ProductHasCallToAction;
import application.persistence.entity.ProductHasFlash;
import application.persistence.repository.*;
import application.rest.domain.FlashDTO;
import application.rest.domain.ProductDTO;
import application.rest.domain.ProductHasFlashDTO;
import application.service.AbstractDatabaseService;
import application.service.flash.FlashService;
import application.service.response.ServiceResponse;
import application.service.response.ServiceResponseStatus;
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
public class ProductServiceImpl extends AbstractDatabaseService<Product, Long, ProductRepository, ProductDTO> implements ProductService {

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
            productHasFlash.setFlash(flashResponse.getBody().toEntity());
            productHasFlash.setProduct(productResponse.getBody().toEntity());
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
            product.setCall(randomProductHasCallToAction.getCallToAction().toDTO());
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
                flashDTOList.add(productHasFlash.getFlash().toDTO());
            }
            dto.setFlashes(flashDTOList);
        }
    }

    @Override
    public ProductRepository getRepository() {
        return productRepository;
    }

}
