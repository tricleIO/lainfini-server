package application.rest;

import application.persistence.entity.DocumentFile;
import application.rest.domain.DocumentFileDTO;
import application.rest.domain.ProductDTO;
import application.service.product.ProductDocumentService;
import application.service.response.ServiceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "/documents")
public class DocumentFileController extends AbstractDatabaseController<DocumentFile, Long, DocumentFileDTO, ProductDocumentService> {


    @Autowired
    private ProductDocumentService productDocumentService;


    /**
     * Save new file product
     * @param productId
     * @param files
     * @return
     */
    @RequestMapping(value = "/upload/for/product/{productId}", method = RequestMethod.POST)
    public ResponseEntity<?> uploadProductDocument(@PathVariable Long productId, @RequestParam("file") MultipartFile[]  files ) {
        List<DocumentFileDTO> documentFileDTOS = new ArrayList<>();
        for (MultipartFile file : files) {
            DocumentFileDTO documentFileDTO = new DocumentFileDTO();
            documentFileDTO.setFileName(file.getOriginalFilename());

            ProductDTO productDTO = new ProductDTO();
            productDTO.setUid(productId);
            HashSet<ProductDTO> productDTOS = new HashSet<>();
            productDTOS.add(productDTO);
            documentFileDTO.setProducts(productDTOS);

            documentFileDTO.setFile(file);
            ServiceResponse<DocumentFileDTO> productDocumentDTOServiceResponse = productDocumentService.create(documentFileDTO);
            documentFileDTOS.add(productDocumentDTOServiceResponse.getBody());
        }
        return new ResponseEntity(documentFileDTOS, HttpStatus.OK);
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> readProduct(@PathVariable UUID id) throws UnsupportedEncodingException {
        return productDocumentService.findByIndex(id);
    }

    /**
     * Get all documents for product
     */
    @RequestMapping(value = "/product/{productId}/", method = RequestMethod.GET)
    public ResponseEntity<?> getProductDocuments(@PathVariable Long productId) {
        return null;
    }


    @Override
    public ProductDocumentService getBaseService() {
        return productDocumentService;
    }

}