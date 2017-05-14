package application.persistence.entity;

import application.rest.domain.CallDTO;
import application.rest.domain.GoodTasteCallDTO;
import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class SoldItemsCall extends CallToAction {

//    private Integer sold;
//    private Integer made;

    @Override
    public CallDTO toDTO(boolean selectAsParent, Object... parentParams) {
        GoodTasteCallDTO soldItemsCallDTO = new GoodTasteCallDTO();
        soldItemsCallDTO.setUid(getId());
        soldItemsCallDTO.setType(getType());
//        soldItemsCallDTO.setMade(made);
//        soldItemsCallDTO.setSold(sold);
        return soldItemsCallDTO;
    }

}
