package application.rest.domain;

import application.persistence.entity.CustomerOrder;
import application.persistence.type.OrderStatusEnum;
import application.rest.CartController;
import application.rest.OrderController;
import application.rest.UserController;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.springframework.hateoas.ResourceSupport;

import java.util.Date;
import java.util.Set;
import java.util.UUID;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderDTO extends ResourceSupport implements ReadWriteDatabaseDTO<CustomerOrder>, IdentifableDTO<UUID> {

    private UUID uid;
    private UUID cartUid;
    private UUID customerUid;
    private Integer deliveryTypeUid;
    private Integer paymentMethodUid;
    private Date createdAt;
    private OrderStatusEnum status;
    private Set<OrderItemDTO> items;
    private Long billingAddressUid;
    private Long deliveryAddressUid;

    private CartDTO cart;
    private UserDTO customer;
    private DeliveryDTO deliveryType;
    private PaymentMethodDTO paymentMethod;
    private AddressDTO billingAddress;
    private AddressDTO deliveryAddress;

    @Override
    public CustomerOrder toEntity(boolean selectAsParent, Object... parentParams) {
        CustomerOrder order = new CustomerOrder();
        order.setCreatedAt(createdAt);
        order.setStatus(status);
        if (selectAsParent) {
            if (cart != null) {
                order.setCart(cart.toEntity(false));
            }
            if (customer != null) {
                order.setCustomer(customer.toEntity(false));
            }
            if (deliveryType != null) {
                order.setDeliveryType(deliveryType.toEntity(false));
            }
            if (paymentMethod != null) {
                order.setPaymentMethod(paymentMethod.toEntity(false));
            }
            if (billingAddress != null) {
                order.setBillingAddress(billingAddress.toEntity(false));
            }
            if (deliveryAddress != null) {
                order.setDeliveryAddress(deliveryAddress.toEntity(false));
            }
        }
        return order;
    }

    @Override
    public void addLinks() {
        add(linkTo(methodOn(OrderController.class).readOrder(uid)).withSelfRel());
        if (cartUid != null) {
            add(linkTo(methodOn(CartController.class).readCart(cartUid)).withRel("cart"));
        }
        if (customerUid != null) {
            add(linkTo(methodOn(UserController.class).readUser(customerUid)).withRel("customer"));
        }
    }
}
