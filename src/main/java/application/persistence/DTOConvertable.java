package application.persistence;

public interface DTOConvertable<T> {

    T toDTO(boolean selectAsParent);

}
