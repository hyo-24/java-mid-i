package exception.ex3.exception;

public class ConnectExceptionV3 extends NetworkClientExceptionV3 { // 연결 실패시 발생하는 예외, 내부에 연결을 시도한 address 를 보관

    private final String address;

    public ConnectExceptionV3(String message, String address) { // 생성자를 입력해두지 않으니까 컴파일 에러가 뜨네?
        // ☝️ 자바에서 자식이 부모를 상속받을 때 반드시 부모의 생성자를 먼저 호출해야하기 때문이다. super() 가 있어야한다!!
        super(message);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
