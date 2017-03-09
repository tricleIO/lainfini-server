package application.service.size;

import application.persistence.entity.Size;
import application.persistence.repository.SizeRepository;
import application.rest.domain.SizeDTO;
import application.service.BaseDatabaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SizeServiceImpl extends BaseDatabaseServiceImpl<Size, Integer, SizeRepository, SizeDTO> implements SizeService {

    @Autowired
    private SizeRepository sizeRepository;

    @Override
    public SizeRepository getRepository() {
        return sizeRepository;
    }

}
