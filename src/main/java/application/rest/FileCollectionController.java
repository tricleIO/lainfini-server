package application.rest;

import application.persistence.entity.FileCollection;
import application.rest.domain.FileCollectionDTO;
import application.service.file.FileCollectionService;
import application.service.response.ServiceResponse;
import application.service.response.ServiceResponseStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.UUID;

/**
 * Created by pfilip on 13.3.17.
 */
@RestController
@RequestMapping(value = "/files/collections/")
public class FileCollectionController extends AbstractDatabaseController<FileCollection, Long, FileCollectionDTO, FileCollectionService> {

    @Autowired
    private FileCollectionService fileCollectionService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> read(Pageable pageable) {
        return readAll(pageable);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> createFileCollection(@RequestBody FileCollectionDTO fileCollectionDTO) {
        return create(fileCollectionDTO);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteFileCollection(@PathVariable Long id) {
        ServiceResponse<FileCollectionDTO> read = fileCollectionService.read(id);
        if (read.getBody() != null) {
            FileCollectionDTO fileCollectionDTO = read.getBody();
            fileCollectionDTO.setValidTo(new Date());
            fileCollectionService.patch(fileCollectionDTO);
            return ResponseEntity.ok(fileCollectionDTO);
        }
        return new ErrorResponseEntity(ServiceResponseStatus.NOT_FOUND);
    }

    @RequestMapping(value = "/{urlSlug}", method = RequestMethod.GET)
    public ResponseEntity<?> readBySlug(@PathVariable String urlSlug) {
        ServiceResponse<FileCollectionDTO> fileCollectionDTOServiceResponse = fileCollectionService.readBySlug(urlSlug);
        if (fileCollectionDTOServiceResponse.getBody() != null) {
            return ResponseEntity.ok(fileCollectionDTOServiceResponse.getBody());
        }
        return new ErrorResponseEntity(ServiceResponseStatus.NOT_FOUND);
    }

    @RequestMapping(value = "/{collectionId}/{fileId}", method = RequestMethod.PATCH)
    public ResponseEntity<?> addFileToCollection(@PathVariable Long collectionId, @PathVariable UUID fileId) {
        return getSimpleResponseEntity(fileCollectionService.addFileToCollection(collectionId, fileId));
    }

    @RequestMapping(value = "/{collectionId}/{fileId}",method = RequestMethod.DELETE)
    public ResponseEntity<?> removeFileFromCollection(@PathVariable Long collectionId, @PathVariable UUID fileId) {
        return getSimpleResponseEntity(fileCollectionService.removeFileFromCollection(collectionId, fileId));
    }

    @Override
    public FileCollectionService getBaseService() {
        return fileCollectionService;
    }
}
