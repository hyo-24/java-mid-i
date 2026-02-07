package lang.string.test;

public class TestString7 {

    public static void main(String[] args) {

        String original = "     Hello Java   ";
        String change = original.strip(); // 언어에 따라 보이지 않는 유니코드가 있을 수 있음! 영어느 알파벳 하나가 1byte 지만 중국어, 한글 이런건 다름

        System.out.println(change);
    }
}
