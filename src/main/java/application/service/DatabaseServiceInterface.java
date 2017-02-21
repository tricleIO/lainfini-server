package application.service;

import application.service.response.ServiceResponse;

import java.io.Serializable;

public interface DatabaseServiceInterface<I extends Serializable, D> {
    ServiceResponse<D> read(I key);
}
