package exception.basic.checked;

public class Client {
    public void call() throws MyCheckedException {
        throw new MyCheckedException("ex"); // 예외도 객체이기 때문에 new 로 생성을 하고 예외를 발생시켜야 한다.
    }
}
