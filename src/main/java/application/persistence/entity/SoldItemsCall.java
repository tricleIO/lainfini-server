package application.persistence.entity;

import application.rest.domain.CallDTO;
import application.rest.domain.SoldItemsCallDTO;
import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class SoldItemsCall extends CallToAction {

//    private Integer sold;
//    private Integer made;

    @Override
    public CallDTO toDTO() {
        SoldItemsCallDTO soldItemsCallDTO = new SoldItemsCallDTO();
        soldItemsCallDTO.setId(getId());
        soldItemsCallDTO.setType(getType());
//        soldItemsCallDTO.setMade(made);
//        soldItemsCallDTO.setSold(sold);
        return soldItemsCallDTO;
    }

}
