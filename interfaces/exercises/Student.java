package interfaces.exercises;

public class Student implements Comparable<Student> {


    private static int counter = 0;
    private Integer id;
    private String firstName;
    private String lastName;
    private Integer age;

    public Student(final String firstName, final String lastName) {
        this.id = ++counter;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static int getCounter() {
        return counter;
    }

    public static void withCounter(final int counter) {
        Student.counter = counter;
    }

    public Integer getId() {
        return id;
    }

    public Student withId(final Integer id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public void withFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void withLastName(final String lastName) {
        this.lastName = lastName;
    }

    public Student withAge(final Integer age) {
        this.age = age;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    /* public Student withAge(final int age) {
        this.age = age;
        return null;
    }

     */

    @Override
    public int compareTo(final Student other) {
        return (this.getLastName().compareTo(other.getLastName()));
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;

        Student student = (Student) o;

        return getId() != null ? getId().equals(student.getId()) : student.getId() == null;
    }

    @Override
    public int hashCode() {
        return getId() != null ? getId().hashCode() : 0;
    }
}
