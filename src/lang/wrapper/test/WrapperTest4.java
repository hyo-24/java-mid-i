package lang.wrapper.test;

public class WrapperTest4 {
    public static void main(String[] args) {
        String str = "100";

        Integer integer = Integer.valueOf(str); // parseInt → 기본형(int), valueOf → 래퍼(Integer)
        System.out.println(integer);

        int intValue = integer;
        System.out.println(intValue);

        Integer integer1 = intValue;
        System.out.println(integer1);

    }
}
