package application.rest.domain;

import lombok.Data;

@Data
public class StatusDTO {

    private String message;
    private String status;
    private int code;

}
