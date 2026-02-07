package exception.ex3.exception;

public class NetworkClientExceptionV3 extends Exception {

    public NetworkClientExceptionV3(String message) { // NetworkClient 에서 발생하는 모든 예외는 이 예외를 부모로 한다.
        super(message);
    }
}
