package application.rest;

import application.persistence.entity.ApplicationFile;
import application.rest.domain.ApplicationFileDTO;
import application.rest.domain.ProductDTO;
import application.service.product.ApplicationFileService;
import application.service.product.ProductService;
import application.service.response.ServiceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "/file")
public class ApplicationFileController extends AbstractFileController<ApplicationFile, ApplicationFileDTO, ApplicationFileService> {

    @Autowired
    private ApplicationFileService applicationFileService;

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/product/{productId}", method = RequestMethod.POST)
    public ResponseEntity<?> uploadProductDocument(@PathVariable UUID productId, @RequestParam("file") MultipartFile[] files) throws IllegalAccessException, InstantiationException {
        List<ApplicationFileDTO> applicationFileDTOS = new ArrayList<>();

        ServiceResponse<ProductDTO> read = productService.read(productId);
        if (read.getBody() != null) {
            ProductDTO productDTO = read.getBody();
            for (MultipartFile file : files) {
                ApplicationFileDTO applicationFileDTO = fileUploadProcess(file);
                applicationFileDTOS.add(applicationFileDTO);
                productDTO.getApplicationFileDTOS().add(applicationFileDTO);
            }
            productService.patch(productDTO);
        }

        return new ResponseEntity(applicationFileDTOS, HttpStatus.OK);
    }

    @Override
    public Class getDTOClazz() {
        return ApplicationFileDTO.class;
    }

    @Override
    public ApplicationFileService getBaseService() {
        return applicationFileService;
    }

}