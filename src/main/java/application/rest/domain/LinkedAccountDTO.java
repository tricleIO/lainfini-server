package application.rest.domain;

import application.persistence.type.AccountPartyEnum;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by pfilip on 3.4.17.
 */
@Data
public class LinkedAccountDTO implements Serializable {

    private AccountPartyEnum party;

    private String token;
}
