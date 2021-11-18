package interfaces.constructors;

public class Base {

    String name;

    public Base() {
        this("");
        System.out.println("No-argument constructor of base class ");

    }

    public Base(String name) {
        this.name = name;
        System.out.println("Calling parameterised constructor of base class");
    }
}
