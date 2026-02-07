package nested.anonymous.ex;

import java.util.Random;

public class Ex1Main {

    public static void helloDice() { // 1부터 6까지의 주사위를 굴려 값을 랜덤으로 출력
        System.out.println("프로그램 시작");

        // 코드 조각 시작
        int randomValue = new Random().nextInt(6)+1;
        System.out.println("주사위 = " + randomValue);
        // 코드 조각 종료

        System.out.println("프로그램 종료");
    }

    public static void helloSum() { // 3개의 정수를 1부터 반복해 출력한다
        System.out.println("프로그램 시작");

        // 코드 조각 시작
        for (int i = 1; i <= 3; i++) {
            System.out.println("i = " + i);
        }
        // 코드 조각 종료

        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        helloDice();
        helloSum();
    }
}
