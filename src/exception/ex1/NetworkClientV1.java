package exception.ex1;

public class NetworkClientV1 {
    private final String address;
    public boolean connectError; // 서버 연결 실패
    public boolean sendError; // 데이터 전송 실패

    public NetworkClientV1(String address) {
        this.address = address;
    }

    public String connect() {
        if (connectError) {
            System.out.println(address + " 서버 연결 실패");
            return "connectError";
        }
        System.out.println(address + " 서버 연결 성공");
        return "success";
    }

    public String send(String data) { // 문자열로 오류 필드에 참/거짓을 저장하고 반환한다.
        if (sendError) {
            System.out.println(address + " 서버에 데이터 전송 실패");
            return "sendError";
        }
        System.out.println(address + " 서버에 데이터 전송 : " + data);
        return "success";
    }

    public void disconnect() {
        System.out.println(address+" 서버 연결 해제");
    }

    public void initError(String data) {
        if (data.contains("error1")) {
            connectError = true; // boolean 타입 멤버변수 값은 return을 하는게 아니라 멤버변수에 T/F 을 넣는 거구나.
            // 이 필드를 메인에서 출력하면 있는지 없는지 알 수 있네
        }
        if (data.contains("error2")) {
            sendError = true;
        }
    }
}
