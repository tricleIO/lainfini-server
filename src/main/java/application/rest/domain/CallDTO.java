package application.rest.domain;

import application.persistence.entity.CallToAction;
import application.persistence.type.CallEnum;
import lombok.Data;

@Data
public abstract class CallDTO implements ReadWriteDatabaseDTO<CallToAction>, IdentifableDTO<Integer> {

    private Integer id;
    private CallEnum type;

    @Override
    public Integer getUid() {
        return id;
    }

    @Override
    public void setUid(Integer key) {
        this.id = key;
    }

}
