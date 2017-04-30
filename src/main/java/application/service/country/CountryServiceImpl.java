package application.service.country;

import application.persistence.entity.Country;
import application.persistence.repository.CountryRepository;
import application.rest.domain.CountryDTO;
import application.service.BaseSoftDeletableDatabaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryServiceImpl extends BaseSoftDeletableDatabaseServiceImpl<Country, Integer, CountryRepository, CountryDTO> implements CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Override
    public CountryRepository getRepository() {
        return countryRepository;
    }

}
