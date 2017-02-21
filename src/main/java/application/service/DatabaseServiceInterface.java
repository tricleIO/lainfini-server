package application.service;

import application.service.response.ServiceResponse;

import java.io.Serializable;
import java.util.List;

public interface DatabaseServiceInterface<I extends Serializable, D> {

    ServiceResponse<D> read(I key);
    ServiceResponse<List<D>> readAll();

}
