package lang.object.tostring;

public class ToStringMain1 {

    public static void main(String[] args) {
        Object object = new Object(); // 어떤 타입도 담을 수 있는 Object 인스턴스를 생성
        String string = object.toString(); // object 인스턴스의 정보를 문자열 변수에 대입한다.

        System.out.println(string); // toString(); 이 인스턴스 정보를 읽는 기능

        System.out.println(object); // object 인스턴스의 참조값을 가지고 있다. 변수를 출력하라는 건 값을
    }
}
