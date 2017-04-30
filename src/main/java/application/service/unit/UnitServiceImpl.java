package application.service.unit;

import application.persistence.entity.Unit;
import application.persistence.repository.UnitRepository;
import application.rest.domain.UnitDTO;
import application.service.BaseSoftDeletableDatabaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UnitServiceImpl extends BaseSoftDeletableDatabaseServiceImpl<Unit, Integer, UnitRepository, UnitDTO> implements UnitService {

    @Autowired
    private UnitRepository unitRepository;

    @Override
    public UnitRepository getRepository() {
        return unitRepository;
    }

}
