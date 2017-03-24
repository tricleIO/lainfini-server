package application.rest.domain;

import application.persistence.entity.ComplaintReason;
import lombok.Data;

@Data
public class ComplaintReasonDTO implements ReadWriteDatabaseDTO<ComplaintReason>, IdentifableDTO<Integer> {

    private Integer uid;
    private String name;

    @Override
    public ComplaintReason toEntity(boolean selectAsParent, Object... parentParams) {
        ComplaintReason complaintReason = new ComplaintReason();
        complaintReason.setId(uid);
        complaintReason.setName(name);
        return complaintReason;
    }

}
