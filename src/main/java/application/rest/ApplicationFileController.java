package application.rest;

import application.persistence.entity.ApplicationFile;
import application.rest.domain.ApplicationFileDTO;
import application.rest.domain.ProductDTO;
import application.service.product.ApplicationFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@RestController
@RequestMapping(value = "/file")
public  class ApplicationFileController extends AbstractFileController<ApplicationFile, ApplicationFileDTO, ApplicationFileService> {


    @Autowired
    private ApplicationFileService applicationFileService;

    /**
     * Save new file product
     *
     * @param productId
     * @param files
     * @return
     */
//    @RequestMapping(value = "/product/{productId}", method = RequestMethod.POST)
//    public ResponseEntity<?> uploadProductDocument(@PathVariable Long productId, @RequestParam("file") MultipartFile[] files) {
//        List<ApplicationFileDTO> applicationFileDTOS = new ArrayList<>();
//        for (MultipartFile file : files) {
//            ApplicationFileDTO applicationFileDTO = new ApplicationFileDTO();
//            applicationFileDTO.setFileName(file.getOriginalFilename());
//
//            if (productId != null) {
//                ProductDTO productDTO = new ProductDTO();
//                productDTO.setUid(productId);
//                HashSet<ProductDTO> productDTOS = new HashSet<>();
//                productDTOS.add(productDTO);
//                applicationFileDTO.setProducts(productDTOS);
//            }
//
//            applicationFileDTO.setFile(file);
//            ServiceResponse<ApplicationFileDTO> productDocumentDTOServiceResponse = getBaseService().create(applicationFileDTO);
//            applicationFileDTOS.add(productDocumentDTOServiceResponse.getBody());
//        }
//        return new ResponseEntity(applicationFileDTOS, HttpStatus.OK);
//    }

    @RequestMapping(value = "/product/{productId}", method = RequestMethod.POST)
    public ResponseEntity<?> uploadProductDocument(@PathVariable Long productId, @RequestParam("file") MultipartFile[] files) throws IllegalAccessException, InstantiationException {
        List<ApplicationFileDTO> applicationFileDTOS = new ArrayList<>();
        for (MultipartFile file : files) {
            ApplicationFileDTO body = fileUploadProcess(file);
            if (productId != null) {
                ProductDTO productDTO = new ProductDTO();
                productDTO.setUid(productId);
                HashSet<ProductDTO> productDTOS = new HashSet<>();
                productDTOS.add(productDTO);
                body.setProducts(productDTOS);
            }

            applicationFileDTOS.add(body);
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