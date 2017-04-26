package application.rest.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BraintreeClientToken {

    private String clientToken;

}
