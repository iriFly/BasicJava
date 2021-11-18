package interfaces.exercises;

public class MainApp {
    public static void main(String[] args) {

        MessageProcessor mes1 = new MessageProcessor() {
            @Override
            public void say(String message) {
                MessageProcessor.super.say(message);
            }
        };

        MessageProcessor mes2 = new MessageProcessor() {
            @Override
            public void say(String message) {
                MessageProcessor.super.say(message);
            }
        } ;

        //mes1.say();
        //mes2.say();

    }
}