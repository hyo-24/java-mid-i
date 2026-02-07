package time.practice.zooSound;


public class Main {
    public static void main(String[] args) {

        Animal[] animal = new Animal[3];

        animal[0] = new Dog("Max", 2); // 생성자로 호출
        animal[1] = new Cat("Kitty", 1);
        animal[2] = new Bird("Coco", 3);

        for (int i = 0; i < animal.length; i++) {
            animal[i].sound();
        }

    }
}
