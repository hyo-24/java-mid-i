package review.ex4;

public class Animal {
    // 단순히 값의 집합만 필요한 경우는 enum 만 쓰면 된다. 그 동물마다 속성(name, age)을 관리해야할 때는 enum 만으로는 부족하다. 그래서 따로 클래스를 만들어 enum을 필드로 포함시키는 것이다.
    // 하지만 실제 실무는 enum에 필드와 메서드를 한번에 설정해둔다.

    public AnimalType type; // enum을 필드로 설정

    public Animal(AnimalType type) {
        this.type = type;
    }

    public AnimalType getType() {
        return type;
    }
}
