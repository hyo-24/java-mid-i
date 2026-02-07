package exception.basic.checked;

public class CheckedCatchMain {

    public static void main(String[] args) {
        Service service = new Service();
        service.callCatch(); // 예외를 처리했기 때문에 main() 메서드까지 예외가 올라오지 않는다.
        // 그래서 main() 에서 출력하는 "정상 종료" 문구나 출력된 것을 확인할 수 있다.
        System.out.println("정상 종료");
    }
}
