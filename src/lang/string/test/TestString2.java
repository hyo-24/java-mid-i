package lang.string.test;

public class TestString2 {

    public static void main(String[] args) {

        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};
        int sum = 0;
        for (String s : arr) { // String 으로 하면 최적화는 안되지만 간단한건 금방 가능하다.
            System.out.println(s + ":" + s.length()); // length() 는 매개변수가 없다!!! 그냥 길이 구하는 것
            sum += s.length(); // 각 배열의 문자 수를 누적해서 더한다.
        }
        System.out.println("sum = "+sum);
    }
}
