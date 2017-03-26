package application.rest.domain;

import application.persistence.entity.Wish;
import application.persistence.type.StatusEnum;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WishDTO implements ReadWriteDatabaseDTO<Wish>, IdentifableDTO<Long>, SoftDeletableDTO {

    private Long uid;
    private UUID productUid;
    private Date addedAt;
    private UUID customerUid;
    private StatusEnum status;

    private ProductDTO product;
    private UserDTO customer;

    @Override
    public Wish toEntity(boolean selectAsParent, Object... parentParams) {
        Wish wish = new Wish();
        wish.setId(uid);
        if (selectAsParent) {
            if (product != null) {
                wish.setProduct(product.toEntity(false));
            }
            if (customer != null) {
                wish.setCustomer(customer.toEntity(false));
            }
        }
        wish.setAddedAt(new Date());
        return wish;
    }

}
