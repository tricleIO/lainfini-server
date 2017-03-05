package application.rest;

import application.persistence.entity.AbstractFile;
import application.persistence.entity.DocumentFile;
import application.rest.domain.DocumentFileDTO;
import application.rest.domain.ProductDTO;
import application.service.product.DocumentFileService;
import application.service.response.ServiceResponse;
import application.util.FileUtil;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "/documents")
public class DocumentFileController extends AbstractDatabaseController<DocumentFile, Long, DocumentFileDTO, DocumentFileService> {


    @Autowired
    private DocumentFileService documentFileService;


    /**
     * Save new file product
     * @param productId
     * @param files
     * @return
     */
    @RequestMapping(value = "/product/{productId}", method = RequestMethod.POST)
    public ResponseEntity<?> uploadProductDocument(@PathVariable Long productId, @RequestParam("file") MultipartFile[]  files ) {
        List<DocumentFileDTO> documentFileDTOS = new ArrayList<>();
        for (MultipartFile file : files) {
            DocumentFileDTO documentFileDTO = new DocumentFileDTO();
            documentFileDTO.setFileName(file.getOriginalFilename());

            if (productId != null) {
                ProductDTO productDTO = new ProductDTO();
                productDTO.setUid(productId);
                HashSet<ProductDTO> productDTOS = new HashSet<>();
                productDTOS.add(productDTO);
                documentFileDTO.setProducts(productDTOS);
            }

            documentFileDTO.setFile(file);
            ServiceResponse<DocumentFileDTO> productDocumentDTOServiceResponse = documentFileService.create(documentFileDTO);
            documentFileDTOS.add(productDocumentDTOServiceResponse.getBody());
        }
        return new ResponseEntity(documentFileDTOS, HttpStatus.OK);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ResponseEntity<?> uploadDocument( @RequestParam("file") MultipartFile[]  files ) {
        List<DocumentFileDTO> documentFileDTOS = new ArrayList<>();
        for (MultipartFile file : files) {
            DocumentFileDTO documentFileDTO = new DocumentFileDTO();
            documentFileDTO.setFileName(file.getOriginalFilename());
            documentFileDTO.setFile(file);
            ServiceResponse<DocumentFileDTO> productDocumentDTOServiceResponse = documentFileService.create(documentFileDTO);
            documentFileDTOS.add(productDocumentDTOServiceResponse.getBody());
        }
        return new ResponseEntity(documentFileDTOS, HttpStatus.OK);
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> readDocument(@PathVariable UUID id) throws UnsupportedEncodingException {
        return documentFileService.findByIndex(id);
    }

    @ResponseBody
    @RequestMapping(value = "/{id}.{extension}", method = RequestMethod.GET)
    public byte[] getFile(@PathVariable UUID id, HttpServletResponse response) throws UnsupportedEncodingException {
        ResponseEntity<?> byIndex = documentFileService.findByIndex(id);
        Long id1 = ((AbstractFile) byIndex.getBody()).getId();
        String structuredDirectoryFromId = documentFileService.getStoreLocation() + FileUtil.getStructuredDirectoryFromId(id1);
        File file = new File(structuredDirectoryFromId + "/" + ((AbstractFile) byIndex.getBody()).getFileName());
        try {
            Path path = Paths.get(structuredDirectoryFromId + "/" + ((AbstractFile) byIndex.getBody()).getFileName());
            String mimeType = Files.probeContentType(path);
            response.setContentType(mimeType);
            response.setContentLength(Math.toIntExact(file.length()));
            response.setHeader("Content-Disposition", "attachment; filename=" + file.getName());
            IOUtils.copy(new FileInputStream(file), response.getOutputStream());
            response.flushBuffer();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Get all documents for product
     */
    @RequestMapping(value = "/product/{productId}/", method = RequestMethod.GET)
    public ResponseEntity<?> getProductDocuments(@PathVariable Long productId) {
        return null;
    }


    @Override
    public DocumentFileService getBaseService() {
        return documentFileService;
    }

}