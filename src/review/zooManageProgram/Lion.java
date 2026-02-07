package review.zooManageProgram;

public class Lion extends Animal{


    public Lion(String name, Integer age) { // 필드가 부모에 생성됐으면 선언은 안해도 되지만 생성자는 선언해야한다!
        super(name, age);
    }

    @Override
    public String sound() {
        return "으르렁-!";
    }
}
