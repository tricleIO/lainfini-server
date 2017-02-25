package application.rest;

import application.persistence.entity.DTOConvertable;
import application.rest.domain.ReadWriteDatabaseDTO;
import application.service.DatabaseServiceInterface;
import application.service.response.ServiceResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.io.Serializable;

public abstract class AbstractDatabaseController<E extends DTOConvertable<D>, I extends Serializable, D extends ReadWriteDatabaseDTO<E>, S extends DatabaseServiceInterface<E, I, D>> {

    protected final ResponseEntity<?> readAll(Pageable pageable) {
        ServiceResponse<Page<D>> response = getBaseService().readAll(pageable);
        Page<D> page = response.getBody();
        // add links
        for (D dto : page.getContent()) {
            dto.addLinks();
        }
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
            D dto = response.getBody();
            dto.addLinks();
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
        D resultDto = (D) response.getBody();
        resultDto.addLinks();
        return new ResponseEntity<>(
                response.getBody(),
                HttpStatus.OK
        );
    }

    public abstract S getBaseService();

}
