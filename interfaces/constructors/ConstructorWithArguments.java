package interfaces.constructors;

public class ConstructorWithArguments {

    public ConstructorWithArguments(String argumentName) {
        System.out.println("Constructor with one argument: " + argumentName);
    }

    public ConstructorWithArguments(String argumentName, int dateOfToday) {
        System.out.println("Constructor with two arguments: Name and Date " + argumentName + dateOfToday);
    }

}
