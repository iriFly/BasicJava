package interfaces.constructors;

public class ConstructorApp {

    public static void main(String[] args) {

        exerciseDefaultConstructor constr1 = new exerciseDefaultConstructor();

        System.out.println(constr1.name);
        System.out.println(constr1.num);

        exerciseParameterizedConstructor constr2 = new exerciseParameterizedConstructor("Sophia", 2014);
        System.out.println("Parameterized constructor with the name: " + constr2.name + " and the id is " + constr2.id);

ConstructorWithArguments geek2 = new ConstructorWithArguments("Georges");
ConstructorWithArguments geek3 = new ConstructorWithArguments("Alexander", 18112021);

    }

}
