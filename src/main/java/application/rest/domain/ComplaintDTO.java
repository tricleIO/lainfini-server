package application.rest.domain;

import application.persistence.entity.Complaint;
import application.persistence.type.ComplaintTypeEnum;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComplaintDTO implements ReadWriteDatabaseDTO<Complaint>, IdentifableDTO<UUID> {

    private UUID uid;
    private ComplaintTypeEnum type;
    private String message;
    private Date createdAt;
    private UUID customerUid;
    private UUID orderUid;
    private UUID productUid;
    private Long imageUid;
    private Integer reasonUid;

    private ComplaintReasonDTO reason;
    private UserDTO customer;
    private OrderDTO order;
    private ProductDTO product;
    private ApplicationFileDTO image;

    @Override
    public Complaint toEntity(boolean selectAsParent, Object... parentParams) {
        Complaint complaint = new Complaint();
        complaint.setId(uid);
        complaint.setType(type);
        complaint.setMessage(message);
        complaint.setCreatedAt(createdAt);
        if (selectAsParent) {
            if (reason != null) {
                complaint.setReason(reason.toEntity(false));
            }
            if (customer != null) {
                complaint.setCustomer(customer.toEntity(false));
            }
            if (order != null) {
                complaint.setOrder(order.toEntity(false));
            }
            if (product != null) {
                complaint.setProduct(product.toEntity(false));
            }
            if (image != null) {
                complaint.setImage(image.toEntity(false));
            }
        }
        return complaint;
    }
}
