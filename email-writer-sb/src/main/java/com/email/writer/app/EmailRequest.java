package com.email.writer.app;


	//provides getters, setters, and contructors
public class EmailRequest {
	private String emailContent;
	private String tone;

    // Default constructor
    public EmailRequest() {
    }

    // Parameterized constructor
    public EmailRequest(String emailContent, String tone) {
        this.emailContent = emailContent;
        this.tone = tone;
    }

    // Getters
    public String getEmailContent() {
        return emailContent;
    }

    public String getTone() {
        return tone;
    }

    // Setters
    public void setEmailContent(String emailContent) {
        this.emailContent = emailContent;
    }

    public void setTone(String tone) {
        this.tone = tone;
    }

    // toString()
    @Override
    public String toString() {
        return "EmailRequest{" +
                "emailContent='" + emailContent + '\'' +
                ", tone='" + tone + '\'' +
                '}';
    }
}