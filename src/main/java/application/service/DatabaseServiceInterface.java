package application.service;

import application.api.ServiceResponse;

import java.io.Serializable;

public interface DatabaseServiceInterface<I extends Serializable, D> {
    ServiceResponse<D> read(I key);
}
