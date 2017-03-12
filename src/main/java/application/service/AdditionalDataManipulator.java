package application.service;

import application.rest.domain.EntityConvertable;
import application.service.response.ServiceResponse;
import application.service.response.ServiceResponseStatus;

import java.io.Serializable;
import java.util.function.Consumer;
import java.util.function.Function;

public class AdditionalDataManipulator<I extends Serializable, D extends EntityConvertable> {

    private final Reader<I, D> reader;
    private final Writer<D> writer;
    private final ServiceResponseStatus errorStatus;

    public AdditionalDataManipulator(Reader<I, D> reader, Writer<D> writer, ServiceResponseStatus errorStatus) {
        this.reader = reader;
        this.writer = writer;
        this.errorStatus = errorStatus;
    }

    public ServiceResponseStatus tryReadToDTO() {
        if (reader.key != null) {
            ServiceResponse<D> response = reader.methodReference.apply(reader.key);
            if (!response.isSuccessful()) {
                return errorStatus;
            }
            writer.methodReference.accept(response.getBody());
        }
        return ServiceResponseStatus.OK;
    }


    // reader
    public static class Reader<I extends Serializable, D extends EntityConvertable> {
        private final I key;
        private final Function<I, ServiceResponse<D>> methodReference;

        public Reader(I key, Function<I, ServiceResponse<D>> reader) {
            this.key = key;
            this.methodReference = reader;
        }
    }

    // writer
    public static class Writer<D extends EntityConvertable> {
        private final Consumer<D> methodReference;

        public Writer(Consumer<D> methodReference) {
            this.methodReference = methodReference;
        }
    }
}
