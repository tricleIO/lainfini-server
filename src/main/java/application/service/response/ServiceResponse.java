package application.service.response;

public class ServiceResponse<B> {

    private B body;
    private ServiceResponseStatus status;

    private ServiceResponse() {
    }

    public static <B> ServiceResponse<B> success(B body) {
        ServiceResponse response = new ServiceResponse();
        response.body = body;
        response.status = ServiceResponseStatus.OK;
        return response;
    }

    public static <B> ServiceResponse<B> error(ServiceResponseStatus status) {
        ServiceResponse response = new ServiceResponse();
        response.status = status;
        return response;
    }

    public B getBody() {
        return body;
    }

    public ServiceResponseStatus getStatus() {
        return status;
    }

    public boolean isSuccessful() {
        return getStatus() == ServiceResponseStatus.OK;
    }
}
