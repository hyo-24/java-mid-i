package exception.ex1;

import java.util.Scanner;

public class MainV1 {

    public static void main(String[] args) {
        // NetworkServiceV1_1 networkService = new NetworkServiceV1_1(); // 흐름제어 역할 객체 생성
        // NetworkServiceV1_2 networkService = new NetworkServiceV1_2();
        NetworkServiceV1_3 networkService = new NetworkServiceV1_3();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("전송할 문자 : ");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            networkService.sendMessage(input); // 입력받은 데이터를 흐름제어 객체로 전송
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }
}
