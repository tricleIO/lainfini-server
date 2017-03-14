package application.persistence.entity;

import application.persistence.DTOConvertable;
import application.rest.domain.DeliveryDTO;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
public class Delivery implements DTOConvertable<DeliveryDTO>, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @Override
    public DeliveryDTO toDTO(boolean selectAsParent, Object... parentParams) {
        DeliveryDTO deliveryDTO = new DeliveryDTO();
        deliveryDTO.setUid(id);
        deliveryDTO.setName(name);
        return deliveryDTO;
    }

}
