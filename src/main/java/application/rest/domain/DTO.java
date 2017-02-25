package application.rest.domain;

import application.persistence.entity.Linkable;

public interface DTO<E> extends EntityConvertable<E>, Linkable {
}
