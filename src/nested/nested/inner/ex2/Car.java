package nested.nested.inner.ex2;

public class Car { // 메인에서 사용
    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model, int chargeLevel) { // 생성자 호출로만 값을 지정
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine(); // new Engine() 만 사용해도 됨. 반드시 Engine e = new Engine() 해야 인스턴스 생성 코드가 되는 것은 아님
    }

    public void start() { // 메인에서 호출하는 메서드
        engine.start(); // ⬅️ 내부 클래스의 메서드
        System.out.println(model + "시작 완료");
    }

    private class Engine { // Car 에서만 사용하는 클래스라서 하나의 클래스에 내부 클래스로 만들었다. (Car 라는 개념이 가지는 특징 중 하나)

        public void start() {
            System.out.println("충전 레벨 확인 : " + chargeLevel);
            System.out.println(model+" 의 엔진을 구동합니다.");
        }
    } // 앞에서의 Engine 클래스처럼 필드 Car 을 만들지 않아도 된다. 왜냐하면 내부 클래스는 외부 클래스의 멤버이기 때문에
}
