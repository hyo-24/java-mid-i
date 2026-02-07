package time.practice.zooSound;

public class Bird extends Animal{

    // public String name; 이미 Animal에 필드가 있어서 다시 선언할 필요 없음(공통된건 다 부모에) | 부모에 선언되지 않은 차별적인 필드가 있으면 선언함
    // public int age;

    public Bird(String name, int age) {
        super(name, age); // 자식 생성자에서 부모 생성자 명시! (공통된 부분은 부모에게 보내서 한번에 처리하게)
        this.name = name;
        this.age = age;
    }

    @Override
    public void sound() {
        System.out.println("Chirp");
    }
}
