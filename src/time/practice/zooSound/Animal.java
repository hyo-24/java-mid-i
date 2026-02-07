package time.practice.zooSound;

public abstract class Animal {

    public String name; // 자식 클래스들이 공통적으로 가지는 속성을 부모 클래스에 필드로 선언함
    public int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void sound(); // 구현 안하면 {} 필요 없음!
    // 마찬가지로 자식들이 공통적으로 가지는 메서드를 사용하기 쉽게 선언해둠. 이 부모에 대한 하위 개념들이 반드시 가져야하는 기능을 강제하는 것

}
