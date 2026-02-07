package exception.ex3;

import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.NetworkClientExceptionV3;
import exception.ex3.exception.SendExceptionV3;

public class NetworkServiceV3_2 {

    public void sendMessage(String data) {
        String address = "http://example.com";

        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);

        } catch (ConnectExceptionV3 e) { // 연결 오류는 개별로 처리
            System.out.println("[연결 오류] 주소: " + e.getAddress() + ", 메세지: " + e.getMessage());

        } catch (NetworkClientExceptionV3 e) { // 나머지 예외들은 상위 예외로 처리
            System.out.println("[네트워크 오류] 메세지: " + e.getMessage());
        } catch (Exception e) { // 알 수 없는 예외 발생 시
            System.out.println("[알 수 없는 오류] 메세지: "+e.getMessage());
        } finally {
            client.disconnect();
        }
    }
}
