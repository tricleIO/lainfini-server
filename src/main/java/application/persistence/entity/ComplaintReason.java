package application.persistence.entity;

import application.persistence.DTOConvertable;
import application.rest.domain.ComplaintReasonDTO;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
public class ComplaintReason implements DTOConvertable<ComplaintReasonDTO>, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @Override
    public ComplaintReasonDTO toDTO(boolean selectAsParent, Object... parentParams) {
        ComplaintReasonDTO complaintReasonDTO = new ComplaintReasonDTO();
        complaintReasonDTO.setUid(id);
        complaintReasonDTO.setName(name);
        return complaintReasonDTO;
    }

}
