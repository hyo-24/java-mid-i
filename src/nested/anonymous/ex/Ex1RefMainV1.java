package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV1 {

    public static void hello(Process process) { // 공통 코드 메서드
        System.out.println("프로그램 시작");
        process.run();
        System.out.println("프로그램 종료");
    }

     static class Dice implements Process { // 정적 중첩 클래스

         @Override
         public void run() { // 인터페이스 메서드의 접근제한자는 기본이 public 이다. default 가 아니다.
             int randomValue = new Random().nextInt(6) + 1;
             System.out.println("주사위 = " + randomValue);

         }
     }

     static class Sum implements Process {

         @Override
         public void run() {
             for (int i = 1; i <= 3; i++) {
                 System.out.println("i = " + i);
             }
         }
     }

    public static void main(String[] args) {

        Dice dice = new Dice();
        Sum sum = new Sum();
        hello(dice);
        hello(sum);
    }
}
