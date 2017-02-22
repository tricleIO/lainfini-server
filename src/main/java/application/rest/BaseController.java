package application.rest;

import application.persistence.entity.DTOConvertable;
import application.rest.domain.EntityConvertable;
import application.service.DatabaseServiceInterface;
import application.service.response.ServiceResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.io.Serializable;

public abstract class BaseController<E extends DTOConvertable<D>, I extends Serializable, D extends EntityConvertable<E>, S extends DatabaseServiceInterface<E, I, D>> {

    public ResponseEntity<?> readAll() {
        ServiceResponse<?> response = getBaseService().readAll();
        return new ResponseEntity<>(
                response.getBody(),
                HttpStatus.OK
        );
    }

    public ResponseEntity<?> read(I id) {
        ServiceResponse<D> response = getBaseService().read(
                id
        );
        if (response.isSuccessful()) {
            return new ResponseEntity<>(
                    response.getBody(),
                    HttpStatus.OK
            );
        } else {
            return new ResponseEntity<>(
                    HttpStatus.NOT_FOUND
            );
        }
    }

    public ResponseEntity<?> create(D dto) {
        ServiceResponse<?> response = getBaseService().create(dto);
        return new ResponseEntity<>(
                response.getBody(),
                HttpStatus.OK
        );
    }

    public abstract S getBaseService();

}
