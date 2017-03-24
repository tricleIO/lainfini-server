package application.persistence.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.commons.lang3.RandomStringUtils;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by pfilip on 22.3.17.
 */
@Entity
@Table(name = "customer_email_verification_token")
@Data
@EqualsAndHashCode(exclude = "user")
public class UserEmailVerificationToken {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private static final int EXPIRATION = 60 * 24;

    @Column(name = "verification_token", length = 255)
    private String token;

    @Column(name = "expiry_date")
    private Date expiryDate;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(nullable = false, name = "customer_id")
    private User user;

    public UserEmailVerificationToken() {
    }

    public UserEmailVerificationToken(User user) {
        this.user = user;
        this.expiryDate = calculateExpiryDate(EXPIRATION);
        this.token = RandomStringUtils.randomAlphanumeric(63);
    }

    private Date calculateExpiryDate(int expiryTimeInMinutes) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Timestamp(cal.getTime().getTime()));
        cal.add(Calendar.MINUTE, expiryTimeInMinutes);
        return new Date(cal.getTime().getTime());
    }

}
