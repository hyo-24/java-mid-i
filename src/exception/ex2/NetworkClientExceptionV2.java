package exception.ex2;

public class NetworkClientExceptionV2 extends Exception { // 체크 예외

    private String errorCode;

    public NetworkClientExceptionV2(String errorCode, String message) {
        super(message); // 오류 메세지를 Throwable 에 넘김
        this.errorCode = errorCode; // 에러코드를 예외 객체에 저장
    }

    public String getErrorCode() {
        return errorCode;
    }


}
