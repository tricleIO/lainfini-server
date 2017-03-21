package application.service.complaint;

import application.persistence.entity.Complaint;
import application.persistence.repository.ComplaintRepository;
import application.rest.domain.ComplaintDTO;
import application.service.AdditionalDataManipulator;
import application.service.AdditionalDataManipulatorBatch;
import application.service.BaseDatabaseServiceImpl;
import application.service.complaintReason.ComplaintReasonService;
import application.service.order.OrderService;
import application.service.product.ApplicationFileService;
import application.service.product.ProductService;
import application.service.response.ServiceResponseStatus;
import application.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ComplaintServiceImpl extends BaseDatabaseServiceImpl<Complaint, UUID, ComplaintRepository, ComplaintDTO> implements ComplaintService {

    @Autowired
    private ComplaintRepository complaintRepository;

    @Autowired
    private ComplaintReasonService complaintReasonService;

    @Autowired
    private UserService userService;

    @Autowired
    private OrderService orderService;

    @Autowired
    private ProductService productService;

    @Autowired
    private ApplicationFileService applicationFileService;

    @Override
    protected AdditionalDataManipulatorBatch<ComplaintDTO> getCreateAdditionalDataLoaderBatch(ComplaintDTO dto) {
        AdditionalDataManipulatorBatch<ComplaintDTO> batch = new AdditionalDataManipulatorBatch<>(dto);
        // add reason
        batch.add(c -> new AdditionalDataManipulator<>(
                new AdditionalDataManipulator.Reader<>(c.getReasonUid(), complaintReasonService::read),
                new AdditionalDataManipulator.Writer<>(c::setReason),
                ServiceResponseStatus.COMPLAINT_REASON_NOT_FOUND
        ));
        // add customer
        batch.add(c -> new AdditionalDataManipulator<>(
                new AdditionalDataManipulator.Reader<>(c.getCustomerUid(), userService::read),
                new AdditionalDataManipulator.Writer<>(c::setCustomer),
                ServiceResponseStatus.CUSTOMER_NOT_FOUND
        ));
        // add order
        batch.add(c -> new AdditionalDataManipulator<>(
                new AdditionalDataManipulator.Reader<>(c.getOrderUid(), orderService::read),
                new AdditionalDataManipulator.Writer<>(c::setOrder),
                ServiceResponseStatus.ORDER_NOT_FOUND
        ));
        // add product
        batch.add(c -> new AdditionalDataManipulator<>(
                new AdditionalDataManipulator.Reader<>(c.getProductUid(), productService::read),
                new AdditionalDataManipulator.Writer<>(c::setProduct),
                ServiceResponseStatus.PRODUCT_NOT_FOUND
        ));
        // add image
        batch.add(c -> new AdditionalDataManipulator<>(
                new AdditionalDataManipulator.Reader<>(c.getImageUid(), applicationFileService::read),
                new AdditionalDataManipulator.Writer<>(c::setImage),
                ServiceResponseStatus.IMAGE_NOT_FOUND
        ));
        return batch;
    }

    @Override
    public ComplaintRepository getRepository() {
        return complaintRepository;
    }

}
