package application.rest.domain;

import application.persistence.entity.ComplaintReason;
import application.persistence.type.StatusEnum;
import lombok.Data;

@Data
public class ComplaintReasonDTO implements ReadWriteDatabaseDTO<ComplaintReason>, SoftDeletableDTO, IdentifableDTO<Integer> {

    private Integer uid;
    private String name;
    private StatusEnum status;

    @Override
    public ComplaintReason toEntity(boolean selectAsParent, Object... parentParams) {
        ComplaintReason complaintReason = new ComplaintReason();
        complaintReason.setId(uid);
        complaintReason.setName(name);
        complaintReason.setStatus(status);
        return complaintReason;
    }

}
