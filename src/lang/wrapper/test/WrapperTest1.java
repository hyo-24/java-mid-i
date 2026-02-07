package lang.wrapper.test;

public class WrapperTest1 {
    public static void main(String[] args) {

        String str1 = "10";
        String str2 = "20";

        Integer strN1 = Integer.parseInt(str1);
        Integer strN2 = Integer.parseInt(str2); // 둘다 문자열을 숫자로 바꾼다. 해당 타입 래퍼 클래스로 (기본형을 객체로 바꿔서 메서드 사용)

        int result = strN1 + strN2;
        System.out.println(result);
    }
}
