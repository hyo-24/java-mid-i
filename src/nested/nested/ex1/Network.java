package nested.nested.ex1;

public class Network { // 메인에서 호출하는 클래스

    public void sendMessage(String text) {
        NetworkMessage networkMessage = new NetworkMessage(text); // 사용하려는 기능이 있는 클래스의 객체 생성
        networkMessage.print(); // 객체의 메서드 호출
    }
}
