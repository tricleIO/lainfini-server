package application.api.customer;

import application.api.Status;
import application.service.domain.CustomerDetails;

public class Response<B> {

    private B body;
    private Status status;

    private Response() {
    }

    public static <B> Response<B> success(B customerDetails) {
        Response response = new Response();
        response.body = customerDetails;
        response.status = Status.OK;
        return response;
    }

    public static <B> Response<B> error(Status status) {
        Response response = new Response();
        response.status = status;
        return response;
    }

    public B getBody() {
        return body;
    }

    public Status getStatus() {
        return status;
    }

    public boolean isSuccessful() {
        return status == Status.OK;
    }
}
