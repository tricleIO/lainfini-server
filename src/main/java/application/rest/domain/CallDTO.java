package application.rest.domain;

import application.persistence.entity.CallToAction;
import application.persistence.type.CallEnum;
import lombok.Data;

@Data
public abstract class CallDTO implements ReadWriteDatabaseDTO<CallToAction> {

    private Integer id;
    private CallEnum type;

}
