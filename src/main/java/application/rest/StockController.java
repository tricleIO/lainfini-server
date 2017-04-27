package application.rest;

import application.persistence.entity.Stock;
import application.persistence.type.UserRoleEnum;
import application.rest.domain.StockDTO;
import application.service.response.ServiceResponse;
import application.service.stock.StockService;
import application.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/stocks")
public class StockController extends AbstractDatabaseController<Stock, Integer, StockDTO, StockService> {

    @Autowired
    private StockService stockService;

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> readStocks(Pageable pageable) {
        return readAll(pageable);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> readStock(@PathVariable Integer id) {
        return read(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> createStock(@RequestBody StockDTO stockDTO) {
        ServiceResponse<Boolean> hasRolesResponse = userService.hasCurrentUserDemandedRoles(
                UserRoleEnum.ROLE_ADMIN
        );
        if (!hasRolesResponse.isSuccessful()) {
            return new ErrorResponseEntity(hasRolesResponse.getStatus());
        }
        return create(stockDTO);
    }

    @Override
    public StockService getBaseService() {
        return stockService;
    }

}