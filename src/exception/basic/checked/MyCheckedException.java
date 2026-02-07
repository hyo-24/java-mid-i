package exception.basic.checked;

public class MyCheckedException extends Exception { //예외 클래스로 예외를 상속 받는다. Exception 을 상속 받은 예외는 체크예외가 된다.
    public MyCheckedException(String message) {
        super(message);
    }
}
