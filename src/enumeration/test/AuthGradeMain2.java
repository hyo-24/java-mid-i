package enumeration.test;

import java.util.Scanner;

public class AuthGradeMain2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("당신의 등급을 입력하세요 [GUEST, LOGIN, ADMIN] : ");
        String grade = scanner.nextLine();

        AuthGrade authGrade =  AuthGrade.valueOf(grade.toUpperCase()); // 문자열을 모두 대문자로 변환해서 같은 문자열인 상수를 반환
        System.out.println("당신의 등급은 "+authGrade.getDescription() +" 입니다.");


        System.out.println("==메뉴 목록==");
        if (authGrade.getLevel() > 0) { // if 를 여러개 쓰면 중복되는 코드를 줄일 수 있지
            System.out.println("- 메인 화면");
        }
        if (authGrade.getLevel() > 1) {
            System.out.println("- 이메일 관리 화면");
        }
        if (authGrade.getLevel() > 2) {
            System.out.println("- 관리자 화면");
        }

    }







}
