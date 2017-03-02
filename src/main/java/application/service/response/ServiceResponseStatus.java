package application.service.response;

import application.rest.domain.StatusDTO;
import org.springframework.http.HttpStatus;

public enum ServiceResponseStatus {

    // generic
    OK("OK", HttpStatus.OK),
    NOT_FOUND("Object with given parameters was not found.", HttpStatus.NOT_FOUND),
    ALREADY_EXISTS("Object with given parameters already exists.", HttpStatus.CONFLICT),

    // user
    USERNAME_ALREADY_EXISTS("User with given username already exists.", HttpStatus.CONFLICT),

    // cart
    CART_OWNER_NOT_FOUND("Cart owner (customer) with given id was not found.", HttpStatus.NOT_FOUND),
    CART_NOT_FOUND("Cart with given id was not found.", HttpStatus.NOT_FOUND),
    PRODUCT_NOT_FOUND("Product with given id was not found.", HttpStatus.NOT_FOUND),

    // category
    PARENT_CATEGORY_NOT_FOUND("Parent category with given id was not found.", HttpStatus.NOT_FOUND),

    INTERNAL_ERROR("Internal error", HttpStatus.INTERNAL_SERVER_ERROR);

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
