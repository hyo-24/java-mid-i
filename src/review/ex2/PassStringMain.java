package review.ex2;

public class PassStringMain {

    public static void main(String[] args) {
        String pass = new String("Zoo-2025-VIP");
        String year = pass.substring(4,8); // 2025
        System.out.println("연도 : "+year);

        if (pass.substring(9,12).equals("VIP")) { // 📌 정석적인 메서드 : contains() -> 문자열 안에 특정 문자열이 포함되어 있는지 확인
            System.out.println("우대 손님입니다!");
        }

        String lowerCase = pass.toLowerCase();
        String upperCase = lowerCase.toUpperCase();


        System.out.println("원본: " + pass);  // 불변 객체 확인
        System.out.println("소문자: " + lowerCase);
        System.out.println("대문자: " + upperCase);

    }



}
