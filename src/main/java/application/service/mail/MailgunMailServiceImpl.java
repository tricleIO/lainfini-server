package application.service.mail;

import application.configuration.AppProperties;
import application.rest.domain.MailDTO;
import application.service.mailchimp.Connection;
import application.service.response.ServiceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.nio.charset.Charset;
import java.util.Base64;

@Service
public class MailgunMailServiceImpl implements MailService {

    @Autowired
    private AppProperties appProperties;

    @Override
    public ServiceResponse<MailDTO> sendMail(MailDTO mailDTO) {

        MultiValueMap<String, Object> parts = new LinkedMultiValueMap<String, Object>();
        parts.add("from",appProperties.getMailgunFromName()+ " <"+appProperties.getMailgunFromEmail()+">");
        parts.add("to", mailDTO.getTo());
        parts.add("subject", mailDTO.getSubject());
        parts.add("text", mailDTO.getText());

        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        requestHeaders.add("Authorization",
                "Basic " + Base64.getUrlEncoder()
                        .encodeToString(("api:"+appProperties.getMailgunApiKey()).getBytes(Charset.forName("UTF-8"))));


        HttpEntity httpEntity = new HttpEntity(parts, requestHeaders);

        ResponseEntity<String> stringResponseEntity = Connection.doRequest("https://api.mailgun.net/v3/"+appProperties.getMailgunDomain()+"/messages", HttpMethod.POST, httpEntity, String.class);

        return ServiceResponse.success(mailDTO);

    }

}
