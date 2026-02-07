package review.ex1;

public class AnimalMain {
    public static void main(String[] args) {

        AnimalInfo animalInfo = new AnimalInfo("dog",5);
        AnimalInfo animalInfo1 = new AnimalInfo("dog",5);

        System.out.println(animalInfo);
        System.out.println(animalInfo1);

        System.out.println("animalInfo.equals(animalInfo1) = " + animalInfo.equals(animalInfo1));
    }
}
