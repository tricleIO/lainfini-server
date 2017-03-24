package application.service.address;

import application.persistence.entity.Address;
import application.persistence.repository.AddressRepository;
import application.rest.domain.AddressDTO;
import application.service.AdditionalDataManipulator;
import application.service.AdditionalDataManipulatorBatch;
import application.service.BaseDatabaseServiceImpl;
import application.service.response.ServiceResponse;
import application.service.response.ServiceResponseStatus;
import application.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class AddressServiceImpl extends BaseDatabaseServiceImpl<Address, Long, AddressRepository, AddressDTO> implements AddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private UserService userService;

    @Override
    public ServiceResponse<Page<AddressDTO>> readCustomerAddresses(UUID customerId, Pageable pageable) {
        Page<Address> addresses = addressRepository.findByCustomerId(customerId, pageable);
        return ServiceResponse.success(
                convertPageWithEntitiesToPageWithDtos(addresses, pageable)
        );
    }

    @Override
    protected AdditionalDataManipulatorBatch<AddressDTO> getAdditionalDataLoaderBatch(AddressDTO dto) {
        AdditionalDataManipulatorBatch<AddressDTO> batch = new AdditionalDataManipulatorBatch<>(dto);
        // add customer
        batch.add(a -> new AdditionalDataManipulator<>(
                new AdditionalDataManipulator.Reader<>(a.getCustomerUid(), userService::read),
                new AdditionalDataManipulator.Writer<>(a::setCustomer),
                ServiceResponseStatus.CUSTOMER_NOT_FOUND
        ));
        return batch;
    }

    @Override
    public AddressRepository getRepository() {
        return addressRepository;
    }

}
