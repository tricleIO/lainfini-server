package application.persistence.entity;

import application.persistence.DTOConvertable;
import application.persistence.type.CartStatus;
import application.rest.domain.CartDTO;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "cart")
@Data
public class Cart implements DTOConvertable<CartDTO>, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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
    public CartDTO toDTO() {
        CartDTO cartDTO = new CartDTO();
        cartDTO.setUid(id);
        cartDTO.setOwnerUid(owner.getId());
        cartDTO.setCreatedAt(createdAt);
        cartDTO.setStatus(status);
        cartDTO.setCreatedFrom(createdFrom);
        return cartDTO;
    }

}
