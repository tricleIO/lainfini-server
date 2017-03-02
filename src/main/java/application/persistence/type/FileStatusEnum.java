package application.persistence.type;

import java.io.Serializable;

/**
 * Created by pfilip on 2.3.17.
 */
public enum FileStatusEnum implements Serializable {
    UPLOADED,
    UPLOADING,
    NOT_UPLOADED,
    DELETED
}
