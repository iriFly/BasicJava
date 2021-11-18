package interfaces.exercises;

public interface MessageProcessor{

default void say(String message) {
    System.out.println("Message " + message);
};

}
