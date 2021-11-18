package interfaces.exercises;

public class StringBufferApp {

    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("IrinaAfanassenkoIsHere");

        int p = s.length();
        int q = s.capacity();

        System.out.println("Length of string is " + p);
        System.out.println("The capacity of string is " + q);

        s.append("andSheStudiesHerButtOff");
        System.out.println(s);

        s.append(2021);
        System.out.println(s);

        s.insert(16, "sExercise");
        System.out.println(s);

        char exerc_arr[] = {'-','l', 'e', 't', 's', 'p', 'l', 'a', 'y','!'};
        s.insert(54, exerc_arr);
        System.out.println(s);

        s.delete(0, 55);
        System.out.println(s);

        s.replace(0,9,"HappyNewYear");
        System.out.println(s);

        s.reverse();
        System.out.println(s);


    }


}
