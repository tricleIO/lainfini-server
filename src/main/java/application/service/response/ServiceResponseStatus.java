package application.service.response;

import application.rest.domain.StatusDTO;
import org.springframework.http.HttpStatus;

public enum ServiceResponseStatus {

    // generic
    OK("OK", HttpStatus.OK),
    NOT_FOUND("Object with given parameters was not found.", HttpStatus.NOT_FOUND),
    ALREADY_EXISTS("Object with given parameters already exists.", HttpStatus.CONFLICT),
    INTERNAL_ERROR("Internal error", HttpStatus.INTERNAL_SERVER_ERROR),
    FORBIDDEN("Access forbidden", HttpStatus.FORBIDDEN),
    UNAUTHORIZED("Unauthorized.", HttpStatus.UNAUTHORIZED),
    OBJECT_BY_SLUG_NOT_FOUND("Object with given slug was not found.", HttpStatus.NOT_FOUND),
    TRANSACTION_NOT_COMPLETE("Transaction was not completed whole, check data for inconsistencies.", HttpStatus.EXPECTATION_FAILED),

    PAYMENT_METHOD_FORBIDDEN("Forbidden payment method.", HttpStatus.FORBIDDEN),

    // user
    USERNAME_ALREADY_EXISTS("User with given username already exists.", HttpStatus.CONFLICT),

    // cart
    CART_OWNER_NOT_FOUND("Cart customer (customer) with given uid was not found.", HttpStatus.NOT_FOUND),
    CART_NOT_FOUND("Cart with given uid was not found.", HttpStatus.NOT_FOUND),

    // product
    PRODUCT_NOT_FOUND("Product with given uid was not found.", HttpStatus.NOT_FOUND),

    // category
    CATEGORY_NOT_FOUND("Category with given uid was not found.", HttpStatus.NOT_FOUND),
    PARENT_CATEGORY_NOT_FOUND("Parent category with given uid was not found.", HttpStatus.NOT_FOUND),

    // material
    MATERIAL_NOT_FOUND("Material with given uid was not found.", HttpStatus.NOT_FOUND),

    // size
    SIZE_NOT_FOUND("Size with given uid was not found.", HttpStatus.NOT_FOUND),

    // unit
    UNIT_NOT_FOUND("Unit with given uid was not found.", HttpStatus.NOT_FOUND),


    COLLECTION_NOT_FOUND("Product collection with given id was not found.", HttpStatus.NOT_FOUND),

    CUSTOMER_NOT_FOUND("Customer with given uid was not found.", HttpStatus.NOT_FOUND),

    DELIVERY_NOT_FOUND("Delivery with given uid was not found.", HttpStatus.NOT_FOUND),

    PAYMENT_METHOD_NOT_FOUND("Payment with given uid was not found.", HttpStatus.NOT_FOUND),

    ORDER_NOT_FOUND("Order with given uid was not found.", HttpStatus.NOT_FOUND),

    ADDRESS_NOT_FOUND("Address with given uid was not found.", HttpStatus.NOT_FOUND),

    CART_NOT_GIVEN("Cart was not given.", HttpStatus.BAD_REQUEST),

    COMPLAINT_REASON_NOT_FOUND("Complaint reason with given uid was not found.", HttpStatus.NOT_FOUND),

    IMAGE_NOT_FOUND("Image with given uid was not found.", HttpStatus.NOT_FOUND),

    SLUG_ALREADY_EXISTS("Slug already exists.", HttpStatus.CONFLICT),

    CART_NOT_OPEN("Cart is not open, it can not be used for creating new product order.", HttpStatus.BAD_REQUEST),

    CARRIER_NOT_FOUND("Carrier with given uid was not found.", HttpStatus.NOT_FOUND),
    SHIPPING_TARIFF_NOT_FOUND("Shipping tariff with given uid was not found.", HttpStatus.NOT_FOUND),
    SHIPPING_REGION_NOT_FOUND("Shipping region with given uid was not found.", HttpStatus.NOT_FOUND),
    CURRENCY_NOT_FOUND("Currency with given uid was not found.", HttpStatus.NOT_FOUND),

    DELIVERY_ADDRESS_NOT_GIVEN("Delivery address was not given.", HttpStatus.BAD_REQUEST),
    CUSTOMER_NOT_GIVEN("Customer was not given.", HttpStatus.BAD_REQUEST),
    TECHNOLOGY_NOT_FOUND("Technology with given uid was not found.", HttpStatus.NOT_FOUND),
    DESIGN_NOT_FOUND("Product design with given uid was not found.", HttpStatus.NOT_FOUND),

    PAYMENT_UNSUCCESSFUL("Unsuccessful payment", HttpStatus.EXPECTATION_FAILED),
    ORDER_ALREADY_PAID("Order has been already paid.", HttpStatus.CONFLICT),
    SERIAL_NUMBER_REQUIRED_FOR_PRODUCT("Serial number is required for this Product.", HttpStatus.BAD_REQUEST),
    AMOUNT_IS_NOT_EQUAL_TO_SERIAL_NUMBER_LIST_SIZE("Amount is not equal to size of given serial numbers list.", HttpStatus.BAD_REQUEST),
    PRODUCT_NOT_GIVEN("Product id was not given.", HttpStatus.BAD_REQUEST),
    NOT_ENOUGH_ITEMS_IN_STOCK("Not enough items in stock.", HttpStatus.NOT_FOUND),
    SELLING_NOT_RESERVED_STOCK_ITEMS("Selling not reserved stock items.", HttpStatus.BAD_REQUEST);

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
