package lang.string.equals;

public class StringEqualsMain {
    public static void main(String[] args) {

        String str1 = new String("hello"); // 인스턴스 생성 후 비교
        String str2 = new String("hello");
        System.out.println("new String() == 비교 : " + (str1 == str2));
        System.out.println("new String() equals 비교 : " + (str1.equals(str2)));

        String str3 = "hello"; // 자바가 자동으로 만들어주는 인스턴스 비교
        String str4 = "hello";
        System.out.println("리터럴 == 비교 : " + (str3 == str4));
        System.out.println("리터럴 equals 비교 : " + (str3.equals(str4)));
    }
}
