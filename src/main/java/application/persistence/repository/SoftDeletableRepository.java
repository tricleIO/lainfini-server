package application.persistence.repository;

import application.persistence.type.StatusEnum;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface SoftDeletableRepository<E> {

    Page<E> findByStatus(StatusEnum status, Pageable pageable);

}
