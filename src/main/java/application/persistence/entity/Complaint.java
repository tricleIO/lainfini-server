package application.persistence.entity;

import application.persistence.DTOConvertable;
import application.persistence.type.ComplaintTypeEnum;
import application.rest.domain.ComplaintDTO;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Entity
@Data
public class Complaint implements DTOConvertable<ComplaintDTO>, Serializable {

    @Id
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @GeneratedValue(generator = "uuid")
    @Column(name = "id", unique = true, nullable = false, columnDefinition = "BINARY(16)")
    private UUID id;

    @Enumerated(EnumType.ORDINAL)
    private ComplaintTypeEnum type;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "reason_id", nullable = false)
    private ComplaintReason reason;

    private String message;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id", nullable = false)
    private User customer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private CustomerOrder order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;

    @OneToOne
    @JoinColumn(name = "image_id", referencedColumnName = "id")
    private ApplicationFile image;

    @NotNull
    @Column(name = "created_at", nullable = false)
    private Date createdAt;


    @Override
    public ComplaintDTO toDTO(boolean selectAsParent, Object... parentParams) {
        ComplaintDTO complaintDTO = new ComplaintDTO();
        complaintDTO.setUid(id);
        complaintDTO.setType(type);
        if (selectAsParent) {
            if (reason != null) {
                complaintDTO.setReason(reason.toDTO(false));
            }
            complaintDTO.setMessage(message);
            if (customer != null) {
                complaintDTO.setCustomerUid(customer.getId());
            }
            if (order != null) {
                complaintDTO.setOrderUid(order.getId());
            }
            if (product != null) {
                complaintDTO.setProductUid(product.getId());
            }
            if (image != null) {
                complaintDTO.setImage(image.toDTO(false));
            }
        }
        complaintDTO.setCreatedAt(createdAt);
        return complaintDTO;
    }

}
