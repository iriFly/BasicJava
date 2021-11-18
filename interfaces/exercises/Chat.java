package interfaces.exercises;

public class Chat {

    //private String from;
    //private String to;

    public void sendMessage(String from, String to, MessageProcessor msgProc){
        System.out.println("Message from " + from + " to " + to + " ");
        //msgProc.say();
    }

    public void sendEmail(String from, String to, MailProcessor emailProc){
        System.out.println("Email from " + from + " to " + to + " ");
        emailProc.email();
    }


}
