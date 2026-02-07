package lang.wrapper.test;

public class WrapperTest3 {
    public static void main(String[] args) {
        String str = "100";

        Integer integer1 = Integer.valueOf(str); // boxing (기본형을 래퍼 클래스로 변경) | parseInt 는 String 일 때
        System.out.println(integer1);

        int intValue = integer1.intValue(); // unboxing
        System.out.println(intValue);

        Integer integer2 = Integer.valueOf(intValue);
        System.out.println(integer2);


    }
}
