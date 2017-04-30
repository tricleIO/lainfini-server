package application.service.technology;

import application.persistence.entity.Technology;
import application.persistence.repository.TechnologyRepository;
import application.rest.domain.TechnologyDTO;
import application.service.BaseSoftDeletableDatabaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TechnologyServiceImpl extends BaseSoftDeletableDatabaseServiceImpl<Technology, Integer, TechnologyRepository, TechnologyDTO> implements TechnologyService {

    @Autowired
    private TechnologyRepository technologyRepository;

    @Override
    public TechnologyRepository getRepository() {
        return technologyRepository;
    }

}
