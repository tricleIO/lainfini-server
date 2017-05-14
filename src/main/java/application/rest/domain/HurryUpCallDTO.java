package application.rest.domain;

import application.persistence.entity.CallToAction;
import application.persistence.entity.SoldItemsCall;
import application.persistence.type.CallEnum;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HurryUpCallDTO extends CallDTO {

    private CallEnum name = CallEnum.HURRY_UP;
    private Long made;

    @Override
    public CallToAction toEntity(boolean selectAsParent, Object... parentParams) {
        SoldItemsCall soldItemsCall = new SoldItemsCall();
        soldItemsCall.setId(getUid());
        soldItemsCall.setType(CallEnum.GOOD_TASTE);
        return soldItemsCall;
    }

}
