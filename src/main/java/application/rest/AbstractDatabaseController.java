package application.rest;

import application.persistence.DTOConvertable;
import application.rest.domain.PageDTO;
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

    protected final ResponseEntity<?> read(I id) {
        ServiceResponse<D> response = getBaseService().read(
                id
        );
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

    protected final ResponseEntity<?> create(D dto) {
        ServiceResponse<?> response = getBaseService().create(dto);
        // success
        if (response.isSuccessful()) {
            D resultDto = (D) response.getBody();
            resultDto.addLinks();
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
