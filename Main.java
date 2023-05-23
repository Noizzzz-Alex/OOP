
public class Main {


    public static void main(String[] args) {
        MailMessage mailMessage1 = new MailMessage();
        mailMessage1.setFrom("from@mail");
        mailMessage1.setTo("to@mail");
        mailMessage1.setSubject("Hello");

        MailMessage mailMessage2 = new MailMessageBuilder()
                .setFrom("from address")
                .build();
    }
}




