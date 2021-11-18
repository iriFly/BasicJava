package interfaces.exercises;

import java.util.*;

public class StudentApp {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        Student st1 = new Student("Irina", "Afanassenko").withAge(35);
        Student st2 = new Student("Sophia", "Dafanassenko").withAge(7);
        Student st3 = new Student("Alexander", "Gafanassenko").withAge(1);
        Student st4 = new Student("Georges", "Rafanassenko").withAge(5);

        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);

        System.out.println("\n" + "The List before sorting: ");
        for (final Student student : students) {
            System.out.println(student);
        }

        Collections.sort(students);

        System.out.println("\n" + "The List after sorting based on Last name: ");
        for (final Student student : students) {
            System.out.println(student);
        }

        System.out.println("\n" + "The List after sorting based on Age: ");

        Comparator<Student> ageComparator = new Comparator<Student>() {
            //ALT + Enter om naar Lambda te converteren
            @Override
            public int compare(Student o1, Student o2) {
                return (o1.getAge().compareTo(o2.getAge()));
            }

        };

        Collections.sort(students, ageComparator);
        for (
                final Student student : students) {
            System.out.println(student);
        }
    }

    //lambda met die operator gebruiken ->


}
