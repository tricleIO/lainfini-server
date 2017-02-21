package application.service.nexmo.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * Created by pfilip on 21.2.17.
 */
@Data
public class IncomingNexmoResponse implements Serializable {

    @SerializedName("message-count")
    private String messageCount;

    @SerializedName("messages")
    private List<NexmoMessage> nexmoMessages = null;

    @Data
    public class NexmoMessage implements Serializable{

        @SerializedName("to")
        private String to;

        @SerializedName("message-id")
        private String messageId;

        @SerializedName("status")
        private String status;

        @SerializedName("remaining-balance")
        private String remainingBalance;

        @SerializedName("message-price")
        private String messagePrice;

        @SerializedName("network")
        private String network;
    }


}