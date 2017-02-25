package application.persistence;

import application.persistence.entity.DTOConvertable;

import java.util.LinkedList;
import java.util.List;

public class EntityToDTOConverter<E extends DTOConvertable<T>, T> {

    private List<E> entities;

    public EntityToDTOConverter(List<E> entities) {
        this.entities = entities;
    }

    public List<T> convert() {
        List<T> dtoList = new LinkedList<>();
        for (E entity : entities) {
            dtoList.add(entity.toDTO());
        }
        return dtoList;
    }

}
