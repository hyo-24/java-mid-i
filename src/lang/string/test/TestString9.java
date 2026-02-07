package lang.string.test;

public class TestString9 {

    public static void main(String[] args) {

        String email = "hello@example.com";
        String[] parts = email.split("@"); // split() 은 문자열을 잘라서 배열로 반환하기 때문에 받을 거면 배열로 받아야 함!!!
        String idPart = parts[0]; // 아니면 나누고 for-each (향상된 for문) 바로 넣어서 하나씩 출력도 된다.
        String domainPart = parts[1];

        // split()은 배열로 반환하기 때문에 굳이 배열에 안넣어줘도 자동으로 배열이 된다. 그래서 배열을 사용하는 for-each 문에 넣어서 하나하나 꺼내서 사용하면 됨

        System.out.println("ID : " + idPart);
        System.out.println("Domain : "+ domainPart);
    }
}
