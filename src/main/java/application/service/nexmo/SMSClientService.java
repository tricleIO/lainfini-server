package application.service.nexmo;

import application.service.nexmo.model.IncomingNexmoResponse;

/**
 * Created by pfilip on 21.2.17.
 */
public interface SMSClientService {

    IncomingNexmoResponse sendMessage(String toPhoneNumber, String messageText);
}
