package application.persistence.entity;

import application.persistence.DTOConvertable;
import application.persistence.type.CartStatus;
import application.rest.domain.CartDTO;
import application.rest.domain.CartItemDTO;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "cart")
@Data
public class Cart implements DTOConvertable<CartDTO>, Serializable {

    @Id
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @GeneratedValue(generator = "uuid")
    @Column(name = "id", unique = true, nullable = false, columnDefinition = "BINARY(16)")
    private UUID id;

    @OneToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id", nullable = true)
    private User customer;

    @NotNull
    @Column(name = "created_at", nullable = false)
    private Date createdAt;

    @Enumerated(EnumType.ORDINAL)
    private CartStatus status;

    private String createdFrom;

    @OneToMany(cascade=CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "cart")
    private Set<CartItem> items;

    @Override
    public CartDTO toDTO(boolean selectAsParent, Object... parentParams) {
        CartDTO cartDTO = new CartDTO();
        cartDTO.setUid(id);
        if (customer != null) {
            cartDTO.setCustomerUid(customer.getId());
        }
        cartDTO.setCreatedAt(createdAt);
        cartDTO.setStatus(status);
        cartDTO.setCreatedFrom(createdFrom);
        // items
        if (items != null) {
            Set<CartItemDTO> itemDTOs = new LinkedHashSet<>(items.size());
            for (CartItem item : items) {
                itemDTOs.add(item.toDTO(false));
            }
            cartDTO.setItems(itemDTOs);
        }
        return cartDTO;
    }

}
