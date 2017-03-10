package application.rest.domain;

import application.persistence.entity.FAQ;
import lombok.Data;

@Data
public class FaqDTO implements ReadWriteDatabaseDTO<FAQ>, IdentifableDTO<Integer> {

    private Integer uid;
    private String question;
    private String answer;

    @Override
    public FAQ toEntity(boolean selectAsParent) {
        FAQ faq = new FAQ();
        faq.setQuestion(question);
        faq.setAnswer(answer);
        return faq;
    }

}
