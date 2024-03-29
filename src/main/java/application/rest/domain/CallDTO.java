package application.rest.domain;

import application.persistence.entity.CallToAction;
import application.persistence.type.CallEnum;
import lombok.Data;

@Data
public abstract class CallDTO implements ReadWriteDatabaseDTO<CallToAction>, IdentifableDTO<Integer> {

    private Integer uid;
    private CallEnum type;

}
