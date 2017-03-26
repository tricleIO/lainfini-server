package application.service.wish;

import application.persistence.entity.Wish;
import application.persistence.repository.WishRepository;
import application.persistence.type.StatusEnum;
import application.rest.domain.ProductDTO;
import application.rest.domain.UserDTO;
import application.rest.domain.WishDTO;
import application.service.AdditionalDataManipulator;
import application.service.AdditionalDataManipulatorBatch;
import application.service.BaseSoftDeletableDatabaseServiceImpl;
import application.service.product.ProductService;
import application.service.response.ServiceResponse;
import application.service.response.ServiceResponseStatus;
import application.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class WishServiceImpl extends BaseSoftDeletableDatabaseServiceImpl<Wish, Long, WishRepository, WishDTO> implements WishService {

    @Autowired
    private WishRepository wishRepository;

    @Autowired
    private UserService userService;

    @Autowired
    private ProductService productService;

    @Override
    public ServiceResponse<Page<WishDTO>> readCustomersWishes(UUID customerId, Pageable pageable) {
        ServiceResponse<UserDTO> userResponse = userService.read(customerId);
        // @TODO - refactor on exists service method
        if (!userResponse.isSuccessful()) {
            return ServiceResponse.error(ServiceResponseStatus.CUSTOMER_NOT_FOUND);
        }
        Page<Wish> wishes = wishRepository.findByCustomerIdAndStatus(customerId, StatusEnum.ACTIVE, pageable);
        Page<WishDTO> pageOfWishDTOs = convertPageWithEntitiesToPageWithDtos(wishes, pageable);
        return ServiceResponse.success(pageOfWishDTOs);
    }

    @Override
    public ServiceResponse<Page<WishDTO>> readCurrentCustomersWishes(Pageable pageable) {
        ServiceResponse<UserDTO> currentUserResponse = userService.readCurrentUser();
        if (!currentUserResponse.isSuccessful()) {
            return ServiceResponse.error(currentUserResponse.getStatus());
        }
        return readCustomersWishes(currentUserResponse.getBody().getUid(), pageable);
    }

    @Override
    protected void additionalUpdateDto(WishDTO dto) {
        ServiceResponse<ProductDTO> productResponse = productService.read(dto.getProductUid());
        if (productResponse.isSuccessful()) {
            dto.setProduct(productResponse.getBody());
        }
    }

    @Override
    public ServiceResponse<WishDTO> create(WishDTO dto) {
        Wish wish = wishRepository.findByCustomerIdAndProductId(dto.getCustomerUid(), dto.getProductUid());
        if (wish != null) {
            if (wish.getStatus() != StatusEnum.ACTIVE) {
                // patch and act like its first time create
                dto.setUid(wish.getId());
                return patch(dto);
            }
            // already exists and active
            return ServiceResponse.error(ServiceResponseStatus.ALREADY_EXISTS);
        }
        // first time create
        return super.create(dto);
    }

    @Override
    public ServiceResponse<WishDTO> removeProductFromWishes(UUID customerId, UUID productId) {
        Wish wish = wishRepository.findByCustomerIdAndProductId(customerId, productId);
        if (wish == null) {
            return ServiceResponse.error(ServiceResponseStatus.NOT_FOUND);
        }
        return delete(wish.getId());
    }

    @Override
    public ServiceResponse<WishDTO> removeProductFromWishesOfCurrentCustomer(UUID productId) {
        ServiceResponse<UserDTO> currentUserResponse = userService.readCurrentUser();
        if (!currentUserResponse.isSuccessful()) {
            return ServiceResponse.error(currentUserResponse.getStatus());
        }
        return removeProductFromWishes(currentUserResponse.getBody().getUid(), productId);
    }

    @Override
    public ServiceResponse<WishDTO> createWishToCurrentUser(WishDTO dto) {
        ServiceResponse<UserDTO> currentUserResponse = userService.readCurrentUser();
        if (!currentUserResponse.isSuccessful()) {
            return ServiceResponse.error(currentUserResponse.getStatus());
        }
        dto.setCustomerUid(currentUserResponse.getBody().getUid());
        return this.create(dto);
    }

    @Override
    protected AdditionalDataManipulatorBatch<WishDTO> getAdditionalDataLoaderBatch(WishDTO wishDTO) {
        AdditionalDataManipulatorBatch<WishDTO> batch = new AdditionalDataManipulatorBatch<>(wishDTO);
        // add user
        batch.add(w -> new AdditionalDataManipulator<>(
                new AdditionalDataManipulator.Reader<>(w.getCustomerUid(), userService::read),
                new AdditionalDataManipulator.Writer<>(w::setCustomer),
                ServiceResponseStatus.CUSTOMER_NOT_FOUND)
        );
        // add product
        batch.add(w -> new AdditionalDataManipulator<>(
                new AdditionalDataManipulator.Reader<>(w.getProductUid(), productService::read),
                new AdditionalDataManipulator.Writer<>(w::setProduct),
                ServiceResponseStatus.PRODUCT_NOT_FOUND)
        );
        return batch;
    }

    @Override
    public WishRepository getRepository() {
        return wishRepository;
    }

}
