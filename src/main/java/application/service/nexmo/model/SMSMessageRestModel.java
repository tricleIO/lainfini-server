package application.service.nexmo.model;

import lombok.Data;

/**
 * Created by pfilip on 21.2.17.
 */
@Data
public class SMSMessageRestModel {
    private String toPhoneNumber;

    private String messageText;
}
