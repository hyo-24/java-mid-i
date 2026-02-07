package exception.ex1;

public class NetworkServiceV1_1 {

    public void sendMessage(String data) { // 입력받은 데이터를 전달 받음
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data); // 에러인지 확인하는 메서드


        client.connect(); // 서버 연결
        client.send(data); // 서버에 데이터 전송
        client.disconnect(); // 서버 연결 종료
    }
}
