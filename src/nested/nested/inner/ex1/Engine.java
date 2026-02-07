package nested.nested.inner.ex1;

public class Engine {

    private Car car; // 클래스 하나를 필드로 가진다

    public Engine(Car car) { // Car 타입만 받는다.
        this.car = car;
    }

    public void start() { // Car 클래스에서 쓰임
        System.out.println("충전 레벨 확인 : " + car.getChargeLevel());
        System.out.println(car.getModel() + "의 엔진을 구동합니다.");
    }

}
