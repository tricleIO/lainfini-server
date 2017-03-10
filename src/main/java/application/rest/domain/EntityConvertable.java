package application.rest.domain;

public interface EntityConvertable<E> {

    E toEntity(boolean selectAsParent);

}
