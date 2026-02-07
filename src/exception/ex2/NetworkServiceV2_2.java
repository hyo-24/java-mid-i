package exception.ex2;

public class NetworkServiceV2_2 {

    public void sendMessage(String data) throws NetworkClientExceptionV2 { // 예외 복구는 생겨난 곳에서 하는게 아니라 Service 에서 처리한다.
        String address = "http://example.com";

        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        try {
            client.connect();
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드 : "+ e.getErrorCode()+", 메세지 : "+ e.getMessage());
            return;
        }

        try {
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드 : "+e.getErrorCode()+", 메세지 : "+e.getMessage());
            return;
        }

        client.disconnect();
    }
}
