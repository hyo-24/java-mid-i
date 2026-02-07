package exception.ex2;

import javax.management.RuntimeErrorException;

public class NetworkClientV2 {
    private final String address;
    public boolean connectError; // 서버 연결 실패
    public boolean sendError; // 데이터 전송 실패

    public NetworkClientV2(String address) {
        this.address = address;
    }

    public void connect() throws NetworkClientExceptionV2 { // initError() 에서 확인한 결과를 가지고 연결 성공인지 예외가 발생하는지 체크
        if (connectError) {
            throw new NetworkClientExceptionV2("connectError", address + " 서버 연결 실패");
        }
        System.out.println(address+" 서버 연결 성공");
    }

    public void send(String data) throws NetworkClientExceptionV2 { // 각각 기능마다 발생할 수 있는 예외에 대한 객체가 있음
        if (sendError) {
            throw new NetworkClientExceptionV2("sendError", address + " 서버에 데이터 전송 실패 : " + data);
            // 예상치 못한 전혀 다른 예외가 발생했을 경우
            //throw new RuntimeException("ex");
        }
        System.out.println(address + " 서버에 데이터 전송 : " + data);
    }

    public void disconnect() {
        System.out.println(address + " 서버 연결 해제");
    }

    public void initError(String data) { // 예외가 발생할지 확인 후 Client 객체의 필드에 저장해둠
        if (data.contains("error1")) {
            connectError = true;
        }
        if (data.contains("error2")) {
            sendError = true;
        }
    }
}
