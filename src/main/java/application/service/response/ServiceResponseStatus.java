package application.service.response;

import application.rest.domain.StatusDTO;
import org.springframework.http.HttpStatus;

public enum ServiceResponseStatus {

    OK("OK", HttpStatus.OK),
    NOT_FOUND("Object not found.", HttpStatus.NOT_FOUND),
    ALREADY_EXISTS("Object already exists.", HttpStatus.CONFLICT);

    private final HttpStatus httpStatus;
    private final String message;

    ServiceResponseStatus(String message, HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
        this.message = message;
    }

    public StatusDTO toStatusDTO() {
        StatusDTO statusDTO = new StatusDTO();
        statusDTO.setMessage(message);
        statusDTO.setStatus(httpStatus.getReasonPhrase());
        statusDTO.setCode(httpStatus.value());
        return statusDTO;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public String getMessage() {
        return message;
    }

}
