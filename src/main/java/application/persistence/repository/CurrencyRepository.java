package application.persistence.repository;

import application.persistence.entity.Currency;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CurrencyRepository extends PagingAndSortingRepository<Currency, Integer> {

}