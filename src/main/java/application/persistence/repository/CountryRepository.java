package application.persistence.repository;

import application.persistence.entity.Country;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CountryRepository extends PagingAndSortingRepository<Country, Integer>, SoftDeletableRepository<Country> {

}