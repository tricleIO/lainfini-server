package application.service.response;

public class ServiceResponse<B> {

    private B body;
    private Status status;

    private ServiceResponse() {
    }

    public static <B> ServiceResponse<B> success(B body) {
        ServiceResponse response = new ServiceResponse();
        response.body = body;
        response.status = Status.OK;
        return response;
    }

    public static <B> ServiceResponse<B> error(Status status) {
        ServiceResponse response = new ServiceResponse();
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
        return getStatus() == Status.OK;
    }
}
