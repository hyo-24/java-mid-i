package time.practice.zooSound;

public class Cat extends Animal{

    // public String name;
    // public int age;

    public Cat(String name, int age) {
        super(name, age);
        this.name = name;
        this.age = age;
    }

    @Override
    public void sound() {
        System.out.println("Meow");
    }
}
