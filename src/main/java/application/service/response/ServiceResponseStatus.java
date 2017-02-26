package application.service.response;

import application.rest.domain.StatusDTO;
import org.springframework.http.HttpStatus;

public enum ServiceResponseStatus {

    // generic
    OK("OK", HttpStatus.OK),
    NOT_FOUND("Object with given parameters was not found.", HttpStatus.NOT_FOUND),
    ALREADY_EXISTS("Object with given parameters already exists.", HttpStatus.CONFLICT),

    // user
    USERNAME_ALREADY_EXIST("User with given username already exists.", HttpStatus.CONFLICT),

    // cart
    CART_OWNER_NOT_FOUND("Cart owner (customer) with given id was not found.", HttpStatus.NOT_FOUND)
    ;

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
