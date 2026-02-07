package exception.ex0;

public class NetworkServiceV0 {

    public void sendMessage(String data) { // 입력받은 데이터를 전달 받음
        String address = "http://example.com";
        NetworkClientV0 client = new NetworkClientV0(address); // 저장된 주소를 가지고 서버 연결 객체를 생성

        // 클라이언트 객체를 제어
        client.connect(); // 서버 연결
        client.send(data); // 서버에 데이터 전송
        client.disconnect(); // 서버 연결 종료
    }
}
