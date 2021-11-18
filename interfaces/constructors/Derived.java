package interfaces.constructors;

public class Derived extends Base {
    public Derived() {
        System.out.println("No-argument constructor of Derived class");
    }

    public Derived(String name) {
        super(name);
        System.out.println("Calling parameterized constructor of Derived class with given parameter: " + name);
    }

    public static void main(String[] args) {
        Derived obj = new Derived("Let's Test");
        System.out.println("------------------------------------------------------");
        Derived obj1 = new Derived();
    }

}
