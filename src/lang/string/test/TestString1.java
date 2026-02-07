package lang.string.test;

public class TestString1 {

    public static void main(String[] args) {

        String url = "https://www.example.com";
        // System.out.println( url.startsWith("https://")); 근데 이렇게 해도 true 나옴. startsWith 가 boolean 타입으로 반환하기 때문
        boolean result = url.startsWith("https://");
        System.out.println(result);


    }
}
