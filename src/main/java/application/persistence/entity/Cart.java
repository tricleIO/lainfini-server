package application.persistence.entity;

import application.rest.domain.CartDTO;
import application.rest.domain.EntityConvertable;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
public class Cart implements DTOConvertable<CartDTO>, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Customer owner;

    private Date createdAt;

    @Override
    public CartDTO toDTO() {
        CartDTO cartDTO = new CartDTO();
        cartDTO.setUid(id);
        cartDTO.setOwnerId(owner.getId());
        cartDTO.setCreatedAt(createdAt);
        return cartDTO;
    }

}
