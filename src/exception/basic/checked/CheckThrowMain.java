package exception.basic.checked;

public class CheckThrowMain {

    public static void main(String[] args) throws MyCheckedException {
        Service service = new Service();
        service.callThrow(); // main() 에서도 예외를 처리 못하면 콘솔에 스택 트레이스(빨간 글씨)가 출력되면서 프로그램이 종료된다.
        System.out.println("정상 종료");
    }
}
