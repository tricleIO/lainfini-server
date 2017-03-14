package application.rest.domain;

import application.persistence.entity.Delivery;
import lombok.Data;

@Data
public class DeliveryDTO implements ReadWriteDatabaseDTO<Delivery>, IdentifableDTO<Integer> {

    private Integer uid;
    private String name;

    @Override
    public Delivery toEntity(boolean selectAsParent, Object... parentParams) {
        Delivery delivery = new Delivery();
        delivery.setId(uid);
        delivery.setName(name);
        return delivery;
    }

}
