package application.service;

import application.rest.domain.EntityConvertable;
import application.service.response.ServiceResponseStatus;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Function;

public class AdditionalDataManipulatorBatch<DTO extends EntityConvertable> {

    private final DTO dto;
    private final Set<Function<DTO, AdditionalDataManipulator>> methodReferences;

    public AdditionalDataManipulatorBatch(DTO dto) {
        this.dto = dto;
        this.methodReferences = new LinkedHashSet<>();
    }

    public void add(Function<DTO, AdditionalDataManipulator> dataManipulatorReference) {
        methodReferences.add(dataManipulatorReference);
    }

    public ServiceResponseStatus tryReadAll() {
        // iterate over all method references to AdditionalDataReader on DTO
        for (Function<DTO, AdditionalDataManipulator> methodReference : methodReferences) {
            // get data reader by injecting its DTO
            AdditionalDataManipulator dataReader = methodReference.apply(dto);
            // and try to load data
            ServiceResponseStatus status = dataReader.tryReadToDTO();
            // check errors
            if (status != ServiceResponseStatus.OK) {
                return status;
            }
        }
        return ServiceResponseStatus.OK;
    }

}