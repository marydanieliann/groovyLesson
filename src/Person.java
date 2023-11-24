import java.util.Objects;

public class Person {
    String name;
    int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        p1.name = "John";
        p1.age = 30;
        p2.name = "John";
        p2.age = 30;

        System.out.println(p1.equals(p2));

        System.out.println(p1.hashCode() == p2.hashCode());
    }
}
