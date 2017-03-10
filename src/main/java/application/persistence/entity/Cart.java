package application.persistence.entity;

import application.persistence.DTOConvertable;
import application.persistence.type.CartStatus;
import application.rest.domain.CartDTO;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "cart")
@Data
public class Cart implements DTOConvertable<CartDTO>, Serializable {

    @Id
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @GeneratedValue(generator = "uuid")
    @Column(name = "id", unique = true, nullable = false, columnDefinition = "BINARY(16)")
    private UUID id;

    @OneToOne
    @NotNull
    @JoinColumn(name = "customer_id", referencedColumnName = "id", nullable = false)
    private User owner;

    @NotNull
    @Column(name = "created_at", nullable = false)
    private Date createdAt;

    @Enumerated(EnumType.ORDINAL)
    private CartStatus status;

    private String createdFrom;

    @Override
    public CartDTO toDTO(boolean selectAsParent) {
        CartDTO cartDTO = new CartDTO();
        cartDTO.setUid(id);
        cartDTO.setOwnerUid(owner.getId());
        cartDTO.setCreatedAt(createdAt);
        cartDTO.setStatus(status);
        cartDTO.setCreatedFrom(createdFrom);
        return cartDTO;
    }

}
