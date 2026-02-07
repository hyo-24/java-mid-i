package lang.string.test;

public class TestString11 {

    public static void main(String[] args) {
        String str = "Hello Java";  // 리터럴 = String 타입
        //StringBuilder sb = new StringBuilder("Hello Java"); // String 타입을 StringBuilder 타입 변수에 담음.
        //String reverse = sb.reverse().toString();

        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(reversed);


    }
}
