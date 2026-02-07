package review.zooManageProgram;

import java.util.Scanner;

public class ZooMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("몇 마리의 동물을 등록할까요?");
        int count = scanner.nextInt();
        scanner.nextLine(); // nextInt() 까먹지 말자

        Animal[] animals = new Animal[count];

        for (int i = 0; i < count; i++) {
            System.out.print("동물의 이름을 입력하세요 : ");
            String name = scanner.nextLine(); // 받을 때 배열에 넣는게 아니라 일단 입력은 변수에 받아두고
            System.out.print("동물의 나이를 입력하세요 : ");
            int age = Integer.parseInt(scanner.nextLine()); // 이 부분이 핵심!
            // int 변수로 받지만 내용은 String 이라서 nextLine() 안해도 됨

            // 조건에 맞게 입력받은 값 분류해서 배열에 저장
            if (i % 2 == 0) { // 조건에 해당하는 것과 아닌 것을 분리해서 배열에 저장!
                animals[i] = new Lion(name, age);
            } else {
                animals[i] = new Monkey(name,age);
            }
        }

        System.out.println("등록된 동물 (나이 5살 이상만 출력) : ");

        for (Animal animal : animals) {
            if (animal.getAge() >= 5) { // 필드에 접근할 때 필드 값 읽어오는 메서드(Getter) 이용!!!
                System.out.println("이름 : "+animal.getName()+", 나이 : "+animal.getAge()+", 소리 : "+animal.sound());
            }
        }

    }
}
