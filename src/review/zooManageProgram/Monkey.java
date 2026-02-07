package review.zooManageProgram;

public class Monkey extends Animal{

    public Monkey(String name, Integer age) {
        super(name, age);
    }

    @Override
    public String sound() {
        return "우끼끼끼끼";
    }
}
