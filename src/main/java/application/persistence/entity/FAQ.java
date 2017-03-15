package application.persistence.entity;

import application.persistence.DTOConvertable;
import application.rest.domain.FaqDTO;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class FAQ implements DTOConvertable<FaqDTO> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "question", length = 255)
    private String question;

    @Column(name = "answer", columnDefinition = "TEXT")
    private String answer;

    @Override
    public FaqDTO toDTO(boolean selectAsParent, Object... parentParams) {
        FaqDTO faqDTO = new FaqDTO();
        faqDTO.setUid(id);
        faqDTO.setQuestion(question);
        faqDTO.setAnswer(answer);
        return faqDTO;
    }

}
