package lang.string.equals;

public class StringEqualsMain2 {
    public static void main(String[] args) {

        String str1 = new String("hello"); // 인스턴스 생성 후 비교
        String str2 = new String("hello");
        System.out.println("메서드 호출 비1 : "+ isSame(str1, str2));

        String str3 = "hello"; // 자바가 자동으로 만들어주는 인스턴스 비교
        String str4 = "hello";
        System.out.println("메서드 호출 비1 : "+ isSame(str3, str4));

    }

    private static boolean isSame(String a, String b) {
        return a == b; // 인스턴스가 같은지
        // return a.equals(b); 데이터가 같은지
    }
}
