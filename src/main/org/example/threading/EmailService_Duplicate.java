package org.example.threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EmailService_Duplicate {
    //responsible for sending emails
    //asynchronous
    //use runnable to encapsulate the email sending the logic and execute it .
    private ExecutorService executorService = Executors.newFixedThreadPool(10);

    public static void main(String[] args) {
        EmailService_Duplicate emailService = new EmailService_Duplicate();
        emailService.sendEmailAsync("manasa.sandam7@gmail.com", "Hi ,Whatsapp", "Thanks");
        emailService.shutdown();
    }

    public void sendEmailAsync(String recipient, String subject, String body) {
        Runnable task = () ->
        {
            System.out.println("sending email to " + recipient + "with subject:" + subject);
            System.out.println("Body:" + body);
        };
        executorService.submit(task);
    }

    public void shutdown() {
        executorService.shutdown();
    }


}
