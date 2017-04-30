package application.rest.domain;

import application.persistence.entity.FAQ;
import application.persistence.type.StatusEnum;
import lombok.Data;

@Data
public class FaqDTO implements ReadWriteDatabaseDTO<FAQ>, IdentifableDTO<Integer>, SoftDeletableDTO {

    private Integer uid;
    private String question;
    private String answer;
    private StatusEnum status;

    @Override
    public FAQ toEntity(boolean selectAsParent, Object... parentParams) {
        FAQ faq = new FAQ();
        faq.setQuestion(question);
        faq.setAnswer(answer);
        return faq;
    }

}
