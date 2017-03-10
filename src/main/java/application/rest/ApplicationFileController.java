package application.rest;

import application.persistence.entity.ApplicationFile;
import application.persistence.entity.Product;
import application.persistence.entity.ProductFile;
import application.rest.domain.ApplicationFileDTO;
import application.service.product.ApplicationFileService;
import application.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/file")
public  class ApplicationFileController extends AbstractFileController<ApplicationFile, ApplicationFileDTO, ApplicationFileService> {

    @Autowired
    private ApplicationFileService applicationFileService;

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/product/{productId}", method = RequestMethod.POST)
    public ResponseEntity<?> uploadProductDocument(@PathVariable Long productId, @RequestParam("file") MultipartFile[] files) throws IllegalAccessException, InstantiationException {
        List<ApplicationFileDTO> applicationFileDTOS = new ArrayList<>();

        Product product = productService.findOne(productId);

        for (MultipartFile file : files) {
            ApplicationFileDTO body = fileUploadProcess(file);
            ApplicationFile applicationFile = body.toEntity();
            ProductFile productFile = new ProductFile();
            productFile.getPf().setFile(applicationFile);
            productFile.getPf().setProduct(product);
            applicationFileDTOS.add(body);
            product.getApplicationFiles().add(productFile);
        }

        productService.saveEntity(product);
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