package application.persistence.repository;

import application.persistence.entity.ProductDocument;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

/**
 * Created by pfilip on 2.3.17.
 */
public interface ProductDocumentRepository extends PagingAndSortingRepository<ProductDocument, Long> {
    ProductDocument findByIndex(UUID fileIndex);
}
