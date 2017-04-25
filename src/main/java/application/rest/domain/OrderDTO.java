package application.rest.domain;

import application.persistence.entity.CustomerOrder;
import application.persistence.type.OrderStatusEnum;
import application.persistence.type.PaymentMethodEnum;
import application.persistence.type.PaymentStateEnum;
import application.rest.CartController;
import application.rest.OrderController;
import application.rest.UserController;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.springframework.hateoas.ResourceSupport;

import java.math.BigDecimal;
import java.math.RoundingMode;
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
    private Integer shippingUid;
    private Integer shippingTariffUid;
    private Integer paymentMethodUid;
    private Date createdAt;
    private Date completedAt; // @TODO - set completed at some place!
    private OrderStatusEnum status;
    private Set<OrderItemDTO> items;
    private Long billingAddressUid;
    private Long deliveryAddressUid;
    private Integer shippingRegionUid;
    private PaymentStateEnum paymentState;

    private CartDTO cart;
    private UserDTO customer;
    private ShippingDTO shipping;
    private ShippingTariffDTO shippingTariff;
    private ShippingRegionDTO shippingRegion;
    private PaymentMethodEnum paymentMethod;
    private AddressDTO billingAddress;
    private AddressDTO deliveryAddress;

    @Override
    public CustomerOrder toEntity(boolean selectAsParent, Object... parentParams) {
        CustomerOrder order = new CustomerOrder();
        order.setId(uid);
        order.setCreatedAt(createdAt);
        order.setCompletedAt(completedAt);
        order.setStatus(status);
        if (selectAsParent) {
            if (cart != null) {
                order.setCart(cart.toEntity(false));
            }
            if (customer != null) {
                order.setCustomer(customer.toEntity(false));
            }
            if (shipping != null) {
                order.setDelivery(shipping.toEntity(false));
            }
            if (shippingRegion != null) {
                order.setShippingRegion(shippingRegion.toEntity(false));
            }
            if (paymentMethod != null) {
                order.setPaymentMethod(paymentMethod);
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

    public BigDecimal getTotalPriceWithShipping() {
        return getTotalPrice().add(this.getShipping().getPrice()).setScale(2, RoundingMode.HALF_UP);
    }

    public BigDecimal getTotalPrice() {
        // total order price
        BigDecimal orderTotalPrice = BigDecimal.ZERO;
        for (OrderItemDTO item : this.getItems()) {
            BigDecimal itemsCost = item.getPrice().multiply(new BigDecimal(item.getQuantity()));
            orderTotalPrice = orderTotalPrice.add(itemsCost);
        }
        return orderTotalPrice.setScale(2, RoundingMode.HALF_UP);
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
        if (items != null) {
            if (items != null) {
                for (OrderItemDTO item : items) {
                    item.addLinks();
                }
            }
        }
    }
}
