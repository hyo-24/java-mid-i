package lang.immutable.change;

public class MutableObj {

        private int value;

    public MutableObj(int value) {
        this.value = value;
    }

    public void add(int addValue) {
        value = value +addValue; // 원래 값에 더하기를 하네 생성때는 10을 넣고 이 메서드로 20을 넣으니까 30이 되네
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
