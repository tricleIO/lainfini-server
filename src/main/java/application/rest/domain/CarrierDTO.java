package application.rest.domain;

import application.persistence.entity.Carrier;
import lombok.Data;

@Data
public class CarrierDTO implements ReadWriteDatabaseDTO<Carrier>, IdentifableDTO<Integer> {

    private Integer uid;
    private String name;
    private String slug;
    private String trackingEndpoint;
    private Long logoUid;

    private ApplicationFileDTO logo;

    @Override
    public Carrier toEntity(boolean selectAsParent, Object... parentParams) {
        Carrier carrier = new Carrier();
        carrier.setId(uid);
        carrier.setName(name);
        carrier.setSlug(slug);
        carrier.setTrackingEndpoint(trackingEndpoint);
        if (selectAsParent) {
            if (logo != null) {
                carrier.setLogo(logo.toEntity(false));
            }
        }
        return carrier;
    }
}
