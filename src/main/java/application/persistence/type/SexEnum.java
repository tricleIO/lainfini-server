package application.persistence.type;

import java.io.Serializable;

public enum SexEnum implements Serializable {

    MALE("M"),
    FEMALE("F"),
    UNKNOWN("U");

    private String value;

    SexEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static SexEnum parseFromDB(String value) {
        for (SexEnum item : SexEnum.values()) {
            if (item.getValue().equals(value)) {
                return item;
            }
        }
        return null;
    }

}
