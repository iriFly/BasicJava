package interfaces.constructors;

public class Temp {

    Temp() {
        this(5);
        System.out.println("The default constructor");
    }

    Temp(int x) {
        this(5, 15);
        System.out.println(x);
    }

    Temp(int x, int y)
    {
        System.out.println("x * y = " + x * y);
    }

    public static void main(String[] args) {
        new Temp();
    }

}
