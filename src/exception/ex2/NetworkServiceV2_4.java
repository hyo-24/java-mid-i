package exception.ex2;

public class NetworkServiceV2_4 {

    public void sendMessage(String data) throws NetworkClientExceptionV2 {
        String address = "http://example.com";

        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드 : "+e.getErrorCode()+", 메세지 : "+e.getMessage());
        }
        client.disconnect(); // sendMessage() 메서드 마지막에 넣어두면 무조건 코드를 끝내고 종료되야 하기 때문에 항상 실행된다.
    }
}
