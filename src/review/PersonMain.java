package review;

public class PersonMain {
    public static void main(String[] args) {

        Person person = new Person(1,"Lee");
        Person person1 = new Person(1,"Lee");

        System.out.println(person);
        System.out.println(person1);

        System.out.println(person.equals(person1));
    }
}
