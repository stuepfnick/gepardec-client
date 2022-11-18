package net.nu_code.gepardec_client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
@ConfigurationProperties("challenge")
public class App {

    private final GepardecClient client;
    private final FileEncoder fileEncoder;
    private final String cvPath;
    private Answer jobApplicationAnswer;


    public App(GepardecClient client, FileEncoder fileEncoder,
               @Value("${challenge.cv_path}") String cvPath) {
        this.client = client;
        this.fileEncoder = fileEncoder;
        this.cvPath = cvPath;
    }

    public void setJobApplicationAnswer(Answer jobApplicationAnswer) {
        this.jobApplicationAnswer = jobApplicationAnswer;
    }

    public void run() {
        String encodedCV = fileEncoder.encodeFileToBase64(cvPath);
        jobApplicationAnswer.setCv(encodedCV);

        Question question = client.getQuestion();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide an anwser to: " + question.getQuestion());
        String answer = scanner.nextLine();

        jobApplicationAnswer.setAnswer(answer);

        System.out.println(jobApplicationAnswer);
        System.out.println("Send? y/N");

        String isDone = scanner.nextLine();
        if (!isDone.equalsIgnoreCase("y")) {
            System.out.println("Mission aborted!");
            return;
        }
        String result = client.postAnswer(jobApplicationAnswer);
        System.out.println(result);
    }
}
