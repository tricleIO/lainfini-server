package application.service.wish;

import application.persistence.entity.Wish;
import application.persistence.repository.WishRepository;
import application.rest.domain.UserDTO;
import application.rest.domain.WishDTO;
import application.service.AdditionalDataManipulator;
import application.service.AdditionalDataManipulatorBatch;
import application.service.BaseDatabaseServiceImpl;
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
public class WishServiceImpl extends BaseDatabaseServiceImpl<Wish, Long, WishRepository, WishDTO> implements WishService {

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
        Page<Wish> wishes = wishRepository.findByCustomerId(customerId, pageable);
        Page<WishDTO> pageOfWishDTOs = convertPageWithEntitiesToPageWithDtos(wishes, pageable);
        return ServiceResponse.success(pageOfWishDTOs);
    }

    @Override
    public ServiceResponse<WishDTO> create(WishDTO dto) {
        if (productCustomerAlreadyWishesExists(dto.getProductUid(), dto.getCustomerUid())) {
            return ServiceResponse.error(ServiceResponseStatus.ALREADY_EXISTS);
        }
        return super.create(dto);
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

    private boolean productCustomerAlreadyWishesExists(UUID productId, UUID customerId) {
        return wishRepository.countByProductIdAndCustomerId(productId, customerId) > 0;
    }

}
