package application.persistence.repository;

import application.persistence.entity.Cart;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface CartRepository extends PagingAndSortingRepository<Cart, UUID> {

}