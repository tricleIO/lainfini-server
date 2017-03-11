package application.persistence.repository;

import application.persistence.entity.UserLikesProduct;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface UserLikesProductRepository extends PagingAndSortingRepository<UserLikesProduct, Integer> {

    Long countByUserLoginAndProductId(String username, UUID productId);

}