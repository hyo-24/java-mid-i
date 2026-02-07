package review.ex4;

public class ZooMain {
    public static void main(String[] args) {

        Animal[] animals = {new Animal(AnimalType.LION), new Animal(AnimalType.GIRAFFE), new Animal(AnimalType.MONKEY)};

        for (Animal animal : animals) {
            switch (animal.getType()) {
                case LION -> System.out.println("어흥");
                case MONKEY -> System.out.println("우끼끼");
                case GIRAFFE -> System.out.println("??");
            }
        }
    }
}
