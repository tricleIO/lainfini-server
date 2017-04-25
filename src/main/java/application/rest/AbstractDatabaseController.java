package application.rest;

import application.persistence.DTOConvertable;
import application.rest.domain.PageDTO;
import application.rest.domain.ReadWriteDatabaseDTO;
import application.service.BaseDatabaseService;
import application.service.response.ServiceResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.io.Serializable;

public abstract class AbstractDatabaseController<E extends DTOConvertable<D>, I extends Serializable, D extends ReadWriteDatabaseDTO<E>, S extends BaseDatabaseService<E, I, D>> {

    protected final ResponseEntity<?> readAll(Pageable pageable) {
        return getPageResponseEntity(
                getBaseService().readAll(pageable)
        );
    }

    protected final ResponseEntity<?> read(I id) {
        return getSimpleResponseEntity(
                getBaseService().read(id)
        );
    }

    protected final ResponseEntity<?> create(D dto) {
        return getSimpleResponseEntity(
                getBaseService().create(dto)
        );
    }

    protected final ResponseEntity<?> delete(I key) {
        return getSimpleResponseEntity(
                getBaseService().delete(key)
        );
    }

    protected final ResponseEntity<?> patch(D dto) {
        return getSimpleResponseEntity(
                getBaseService().patch(dto)
        );
    }

    protected ResponseEntity<?> getPageResponseEntity(ServiceResponse<Page<D>> response) {
        if (response.isSuccessful()) {
            Page<D> page = response.getBody();
            // add links to page
            PageDTO<D> pageDTO = new PageDTO<>(page);
            // add links to page content elements
            for (D dto : pageDTO.getContent()) {
                dto.addLinks();
            }
            // return page
            return new ResponseEntity<>(
                    pageDTO,
                    HttpStatus.OK
            );
        }
        return new ErrorResponseEntity(response.getStatus());
    }

    protected ResponseEntity<?> getSimpleResponseEntity(ServiceResponse<D> response) {
        // success
        if (response.isSuccessful()) {
            D dto = response.getBody();
            // add hypermedia links
            dto.addLinks();
            return new ResponseEntity<>(
                    response.getBody(),
                    HttpStatus.OK
            );
        }
        // error
        return new ErrorResponseEntity(response.getStatus());
    }

    public abstract S getBaseService();

}
