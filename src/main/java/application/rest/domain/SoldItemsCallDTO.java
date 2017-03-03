package application.rest.domain;

import application.persistence.entity.CallToAction;
import application.persistence.entity.SoldItemsCall;
import application.persistence.type.CallEnum;
import lombok.Data;

@Data
public class SoldItemsCallDTO extends CallDTO {

    private Integer sold;
    private Integer made;

    @Override
    public CallToAction toEntity() {
        SoldItemsCall soldItemsCall = new SoldItemsCall();
        soldItemsCall.setType(CallEnum.GOOD_TASTE);
        soldItemsCall.setMade(made);
        soldItemsCall.setSold(sold);
        return soldItemsCall;
    }

}
