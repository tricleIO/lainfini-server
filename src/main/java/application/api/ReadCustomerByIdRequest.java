package application.api;

public class ReadCustomerByIdRequest {

    private final Long id;

    public ReadCustomerByIdRequest(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

}
