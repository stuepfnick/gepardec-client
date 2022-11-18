package net.nu_code.gepardec_client;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
class GepardecClientTest {

    @Autowired
    private GepardecClient client;

    @MockBean
    private RestTemplate restTemplate;

    @MockBean
    private AppRunner app_intoVoid;

    @Value("${challenge.base_url}")
    private String base_url;

    @Test
    void getQuestion() {
        String url = base_url + "1";
        Question expected = new Question(1, "Some question?");
        when(restTemplate.getForObject(url, Question.class)).thenReturn(expected);

        Question result = client.getQuestion();

        assertEquals(expected, result);
        verify(restTemplate).getForObject(url, Question.class);
    }

    @Test
    void postAnswer() {
        String url = base_url + "1/answer";
        String expected = "ok";
        Answer testAnswer = new Answer("123", "Max", "Mustermann", "50", Source.SONSTIGES);

        when(client.postAnswer(testAnswer)).thenReturn(expected);
        String response = client.postAnswer(testAnswer);

        assertEquals(expected, response);
        verify(restTemplate).postForObject(url, testAnswer, String.class);
    }
}
