package lang.string.chaining;

public class ValueAdder {

    private int value;

    public ValueAdder add(int addValue) {
        value += addValue;
        return this; // 값을 바꾼 본인 인스턴스를 반환. 그래서 참조값을 알 수 있음!
    }

    public int getValue() {
        return value; // 인스턴스의 필드 값을 반환!
    }
}
