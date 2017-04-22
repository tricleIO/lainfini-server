package application.rest;

import application.persistence.entity.StockItem;
import application.persistence.type.UserRoleEnum;
import application.rest.domain.StockItemDTO;
import application.rest.domain.UnstockItemsDTO;
import application.service.response.ServiceResponse;
import application.service.stockItem.StockItemService;
import application.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping(value = "/stock")
public class StockItemController extends AbstractDatabaseController<StockItem, Long, StockItemDTO, StockItemService> {

    @Autowired
    private StockItemService stockItemService;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/items", method = RequestMethod.GET)
    public ResponseEntity<?> readStockedItems(@RequestParam(name = "productId", required = false) UUID productId, Pageable pageable) {
        ServiceResponse<Boolean> isAdminResponse = userService.hasCurrentUserDemandedRoles(
                UserRoleEnum.ROLE_ADMIN
        );
        if (!isAdminResponse.isSuccessful()) {
            return new ErrorResponseEntity(isAdminResponse.getStatus());
        }
        if (productId != null) {
            return getPageResponseEntity(
                    stockItemService.readProductStockedItems(productId, pageable)
            );
        }
        return getPageResponseEntity(
                stockItemService.readStockedItems(pageable)
        );
    }

    @RequestMapping(value = "/items/unstock", method = RequestMethod.POST)
    public ResponseEntity<?> unstockItems(@RequestBody UnstockItemsDTO unstockItemsDTO) {
        ServiceResponse<Boolean> isAdminResponse = userService.hasCurrentUserDemandedRoles(
                UserRoleEnum.ROLE_ADMIN
        );
        if (!isAdminResponse.isSuccessful()) {
            return new ErrorResponseEntity(isAdminResponse.getStatus());
        }
//        if (unstockItemsDTO.getSerialNumbers() != null && !unstockItemsDTO.getSerialNumbers().isEmpty()) {
//            return getPageResponseEntity(
//                    stockItemService.unstockProduct(
//                            unstockItemsDTO.getProductUid(),
//                            unstockItemsDTO.getAmount(),
//                            unstockItemsDTO.getSerialNumbers()
//                    )
//            );
//        }
        return getPageResponseEntity(
                stockItemService.reserveProduct(
                        unstockItemsDTO.getProductUid(),
                        unstockItemsDTO.getAmount(),
                        unstockItemsDTO.getOrderUid()
                )
        );
    }

    @RequestMapping(value = "/items/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> readStockItem(@PathVariable Long id) {
        ServiceResponse<Boolean> isAdminResponse = userService.hasCurrentUserDemandedRoles(
                UserRoleEnum.ROLE_ADMIN
        );
        if (!isAdminResponse.isSuccessful()) {
            return new ErrorResponseEntity(isAdminResponse.getStatus());
        }
        return read(id);
    }

    @RequestMapping(value = "/items", method = RequestMethod.POST)
    public ResponseEntity<?> createStockItem(@RequestBody StockItemDTO stockItemDTO) {
        ServiceResponse<Boolean> isAdminResponse = userService.hasCurrentUserDemandedRoles(
                UserRoleEnum.ROLE_ADMIN
        );
        if (!isAdminResponse.isSuccessful()) {
            return new ErrorResponseEntity(isAdminResponse.getStatus());
        }
        return create(stockItemDTO);
    }

    @Override
    public StockItemService getBaseService() {
        return stockItemService;
    }

}