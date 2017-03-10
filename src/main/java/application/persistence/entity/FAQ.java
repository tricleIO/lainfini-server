package application.persistence.entity;

import application.persistence.DTOConvertable;
import application.rest.domain.FaqDTO;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class FAQ implements DTOConvertable<FaqDTO> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String question;

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
