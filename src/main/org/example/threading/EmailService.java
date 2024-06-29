package org.example.threading;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EmailService {

    // SMTP server configuration (replace with your SMTP server details)
    private static final String SMTP_HOST = "smtp.example.com";
    private static final String SMTP_PORT = "587";
    private static final String EMAIL_USERNAME = "manasa.sandam7@gmail.com"; // Replace with your email address
    private static final String EMAIL_PASSWORD = "#Swati2ashu3."; // Replace with your email password
    private ExecutorService executorService = Executors.newFixedThreadPool(10);

    public static void main(String[] args) {
        // Example usage: Sending email asynchronously
        EmailService emailService = new EmailService();
        emailService.sendEmailAsync("manasa.sandam7@gmail.com", "Test Email", "Hello from JavaMail!");

        // Shutdown the executor service when done
        emailService.shutdown();
    }

    public void sendEmailAsync(String recipient, String subject, String body) {
        Runnable task = () -> {
            try {
                // Create properties for the SMTP connection
                Properties props = new Properties();
                props.put("mail.smtp.auth", "true");
                props.put("mail.smtp.starttls.enable", "true");
                props.put("mail.smtp.host", SMTP_HOST);
                props.put("mail.smtp.port", SMTP_PORT);

                // Create a session with authentication
                Session session = Session.getInstance(props, new Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(EMAIL_USERNAME, EMAIL_PASSWORD);
                    }
                });

                // Create a MimeMessage object
                Message message = new MimeMessage(session);
                message.setFrom(new InternetAddress(EMAIL_USERNAME));
                message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
                message.setSubject(subject);
                message.setText(body);

                // Send the message
                Transport.send(message);
                System.out.println("Email sent successfully to " + recipient);

            } catch (MessagingException e) {
                System.err.println("Error sending email: " + e.getMessage());
            }
        };

        // Submit the task to the executor service for asynchronous execution
        executorService.submit(task);
    }

    public void shutdown() {
        executorService.shutdown();
    }
}
