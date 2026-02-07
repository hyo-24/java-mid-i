package lang.object.poly;

public class ObjectPolyExample1 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);

    }

    private static void action(Object object) {
        // object.sound();
        // object.move(); 는 부모가 자식의 메서드를 호출할 수 없음! 오버라이딩 하거나 다운캐스팅 해야한다.

        if (object instanceof Dog dog) {
            dog.sound();
        } else if (object instanceof Car car) {
            car.move();
        }

    }
}
