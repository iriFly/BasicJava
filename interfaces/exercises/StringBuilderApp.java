package interfaces.exercises;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class StringBuilderApp {

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();

        str.append("StringToBuilder");

        System.out.println("String: " + str.toString());

        StringBuilder str1 = new StringBuilder("AAABBBCCCDDDEEEFFFGGG");
        System.out.println("String1 is: " + str1.toString());

        StringBuilder str2 = new StringBuilder(10);
        System.out.println("String2 is: " + str2.capacity());

        StringBuilder str3 = new StringBuilder(str1.toString());
        System.out.println("String3 is: " + str3.toString());


    }
}
