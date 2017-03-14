package application.rest;

import application.persistence.entity.FileCollection;
import application.rest.domain.FileCollectionDTO;
import application.service.file.FileCollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * Created by pfilip on 13.3.17.
 */
@RestController
@RequestMapping(value = "/file-collection")
public class FileCollectionController extends AbstractDatabaseController<FileCollection, Long, FileCollectionDTO, FileCollectionService> {

    @Autowired
    private FileCollectionService fileCollectionService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> read(Pageable pageable) {
        return readAll(pageable);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> readById(@PathVariable Long id) {
        return read(id);
    }

    @RequestMapping(value = "/add/{collectionId}/{fileId}")
    public ResponseEntity<?> addFileToCollection(@PathVariable Long collectionId, @PathVariable UUID fileId) {
        return getSimpleResponseEntity(fileCollectionService.addFileToCollection(collectionId, fileId));
    }

    @RequestMapping(value = "/remove/{collectionId}/{fileId}")
    public ResponseEntity<?> removeFileFromCollection(@PathVariable Long collectionId, @PathVariable UUID fileId) {
        return getSimpleResponseEntity(fileCollectionService.removeFileFromCollection(collectionId, fileId));

    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> createFileCollection(@RequestBody FileCollectionDTO fileCollectionDTO) {
        return create(fileCollectionDTO);
    }

    @Override
    public FileCollectionService getBaseService() {
        return fileCollectionService;
    }
}
