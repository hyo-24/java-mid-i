package exception.ex1;

public class NetworkServiceV1_3 {

    public void sendMessage(String data) {
        NetworkClientV1 client = new NetworkClientV1("http://example.com");
        client.initError(data);

        String connectResult = client.connect(); // 반환값을 받아서
        if (isError(connectResult)) { // 메서드 결과가 true 면 밑의 코드 실행 아니면 종료
            System.out.println("[네트워크 오류 발생] 오류 코드 : " + connectResult);
        } else {
            String sendResult = client.send(data);
            if (isError(sendResult)) {
                System.out.println("[네트워크 오류 발생] 오류 코드 : " + sendResult);
            }
        }
        client.disconnect(); // return 을 제거해 앞의 결과에 상관 없이 무조건 호출된다.
    }

    private static boolean isError(String resultCode) {
        return !resultCode.equals("success"); // 성공이 아닐 때 -> 오류일때! true 가 된다
    }
}
