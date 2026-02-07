package nested.nested.inner.ex1;

public class Car {

    private String model;
    private int chargeLevel;
    private Engine engine; // engine 은 인스턴스인 필드다.

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine(this); // 인스턴스 생성!
    }

    public String getModel() {
        return model;
    }

    public int getChargeLevel() {
        return chargeLevel;
    }

    public void start() {
        engine.start();
        System.out.println(model+" 시작 완료");
    }
}
