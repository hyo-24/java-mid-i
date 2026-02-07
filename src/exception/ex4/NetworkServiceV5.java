package exception.ex4;

public class NetworkServiceV5 {

    public void sendMessage(String data) {
        String address = "http://example.com";

        /*NetworkClientV4 client = new NetworkClientV4(address);
        client.initError(data);*/

        try (NetworkClientV5 client = new NetworkClientV5(address)){ // 사용할 외부 자원을 try 에 명시
            client.initError(data); // 💥이걸 빼먹어서 에러가 인식이 안됐음
            client.connect();
            client.send(data);
            // catch 블록으로 가기 전에 혹은 예외가 전파되기 전에 해당 리소스의 close()가 먼저 자동으로 호출된다.
        } catch (Exception e){
            System.out.println("[예외 확인]: " + e.getMessage());
            throw e;
        }
    }
}
