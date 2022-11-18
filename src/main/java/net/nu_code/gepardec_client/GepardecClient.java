package net.nu_code.gepardec_client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class GepardecClient {
    private final RestTemplate restTemplate;
    private final String base_url;

    public GepardecClient(RestTemplate restTemplate,
                          @Value("${challenge.base_url}") String base_url) {

        this.restTemplate = restTemplate;
        this.base_url = base_url;
    }

    public Question getQuestion() {
        String url = base_url + "1";

        return restTemplate.getForObject(url, Question.class);
    }

    public String postAnswer(Answer jobApplicationAnswer) {
        String url = base_url + "1/answer";

        return restTemplate.postForObject(url, jobApplicationAnswer, String.class);
    }
}
