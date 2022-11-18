package net.nu_code.gepardec_client;

import java.util.Objects;

public class Answer {
    private String jobId;
    private String firstName;
    private String lastName;
    private String email;
    private String answer;
    private Source source;
    private String messageToGepardec;
    private String otherSource;
    private String title;
    private String phone;
    private String linkedInLink;
    private String xingLink;
    private String cv;

    public Answer() {
    }

    public Answer(String jobId, String firstName, String lastName, String answer, Source source) {
        this.jobId = jobId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.answer = answer;
        this.source = source;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public String getMessageToGepardec() {
        return messageToGepardec;
    }

    public void setMessageToGepardec(String messageToGepardec) {
        this.messageToGepardec = messageToGepardec;
    }

    public String getOtherSource() {
        return otherSource;
    }

    public void setOtherSource(String otherSource) {
        this.otherSource = otherSource;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLinkedInLink() {
        return linkedInLink;
    }

    public void setLinkedInLink(String linkedInLink) {
        this.linkedInLink = linkedInLink;
    }

    public String getXingLink() {
        return xingLink;
    }

    public void setXingLink(String xingLink) {
        this.xingLink = xingLink;
    }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Answer answer1 = (Answer) o;
        return Objects.equals(jobId, answer1.jobId) && Objects.equals(firstName, answer1.firstName) && Objects.equals(lastName, answer1.lastName) && Objects.equals(email, answer1.email) && Objects.equals(answer, answer1.answer) && Objects.equals(source, answer1.source) && Objects.equals(messageToGepardec, answer1.messageToGepardec) && Objects.equals(otherSource, answer1.otherSource) && Objects.equals(title, answer1.title) && Objects.equals(phone, answer1.phone) && Objects.equals(linkedInLink, answer1.linkedInLink) && Objects.equals(xingLink, answer1.xingLink) && Objects.equals(cv, answer1.cv);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, firstName, lastName, email, answer, source, messageToGepardec, otherSource, title, phone, linkedInLink, xingLink, cv);
    }

    @Override
    public String toString() {
        return "Answer{" +
                "jobId='" + jobId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", answer='" + answer + '\'' +
                ", source='" + source + '\'' +
                ", messageToGepardec='" + messageToGepardec + '\'' +
                ", otherSource='" + otherSource + '\'' +
                ", title='" + title + '\'' +
                ", phone='" + phone + '\'' +
                ", linkedInLink='" + linkedInLink + '\'' +
                ", xingLink='" + xingLink + '\'' +
                ", cv='" + cv + '\'' +
                '}';
    }
}
