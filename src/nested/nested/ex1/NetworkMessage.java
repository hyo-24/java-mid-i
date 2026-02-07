package nested.nested.ex1;

public class NetworkMessage { // 안에서 사용되는 클래스
    private String content;

    public NetworkMessage(String content) { // text를 받아서 본인 필드에 저장
        this.content = content;
    }

    public void print() { // 받은 text를 사용하는 메서드
        System.out.println(content);
    }
}
