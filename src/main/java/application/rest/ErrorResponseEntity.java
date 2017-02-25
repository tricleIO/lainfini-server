package application.rest;

import application.rest.domain.StatusDTO;
import application.service.response.ServiceResponseStatus;
import org.springframework.http.ResponseEntity;

public class ErrorResponseEntity extends ResponseEntity<StatusDTO> {

    public ErrorResponseEntity(ServiceResponseStatus body) {
        super(body.toStatusDTO(), body.getHttpStatus());
    }

}
