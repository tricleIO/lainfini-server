package application.service.mailchimp.model;

import lombok.Data;

/**
 * Created by pfilip on 24.2.17.
 */
@Data
public class MailChimpSubscribeModel {

    private String mail;

    private String listId;
}
