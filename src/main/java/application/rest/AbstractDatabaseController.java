package application.rest;

import application.persistence.entity.DTOConvertable;
import application.rest.domain.EntityConvertable;
import application.service.DatabaseServiceInterface;
import application.service.response.ServiceResponse;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.io.Serializable;

public abstract class AbstractDatabaseController<E extends DTOConvertable<D>, I extends Serializable, D extends EntityConvertable<E>, S extends DatabaseServiceInterface<E, I, D>> {

    protected final ResponseEntity<?> readAll(Pageable pageable) {
        ServiceResponse<?> response = getBaseService().readAll(pageable);
        return new ResponseEntity<>(
                response.getBody(),
                HttpStatus.OK
        );
    }

    protected final ResponseEntity<?> read(I id) {
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

    protected final ResponseEntity<?> create(D dto) {
        ServiceResponse<?> response = getBaseService().create(dto);
        return new ResponseEntity<>(
                response.getBody(),
                HttpStatus.OK
        );
    }

    public abstract S getBaseService();

}
