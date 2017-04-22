package application.rest;

import application.persistence.entity.ShippingTariff;
import application.persistence.type.UserRoleEnum;
import application.rest.domain.ShippingTariffDTO;
import application.service.response.ServiceResponse;
import application.service.shippingTariff.ShippingTariffService;
import application.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/shipping/tariffs")
public class ShippingTariffController extends AbstractDatabaseController<ShippingTariff, Integer, ShippingTariffDTO, ShippingTariffService> {

    @Autowired
    private ShippingTariffService shippingTariffService;

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> readTariffs(@RequestParam(required = false, name = "country-code") String countryCode, @RequestParam(required = false, name = "country-id") Integer countryId, Pageable pageable) {
        if (countryCode != null) {
            return getPageResponseEntity(shippingTariffService.readByCountryCode(countryCode, pageable));
        }
        if (countryId != null) {
            return getPageResponseEntity(shippingTariffService.readByCountryId(countryId, pageable));
        }
        return readAll(pageable);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> readTariff(@PathVariable Integer id) {
        return read(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> createTariff(@RequestBody ShippingTariffDTO ShippingTariffDTO) {
        ServiceResponse<Boolean> hasRolesResponse = userService.hasCurrentUserDemandedRoles(
                UserRoleEnum.ROLE_ADMIN
        );
        if (!hasRolesResponse.isSuccessful()) {
            return new ErrorResponseEntity(hasRolesResponse.getStatus());
        }
        return create(ShippingTariffDTO);
    }

    @Override
    public ShippingTariffService getBaseService() {
        return shippingTariffService;
    }

}