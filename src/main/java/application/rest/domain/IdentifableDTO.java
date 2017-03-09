package application.rest.domain;

import java.io.Serializable;

public interface IdentifableDTO<I extends Serializable> {

    I getUid();
    void setUid(I key);

}
