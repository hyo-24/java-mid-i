package lang.immutable.change;

public class ImmutableObj {

    private final int value; // 생성자로 초기화 시켜주니까 오류가 사라짐
                                // “이 필드는 한 번만 초기화 가능 그리고 반드시 생성자나 선언 시점에서 초기화해야 함

    public ImmutableObj(int value) {
        this.value = value;
    }

    public ImmutableObj add(int addValue) {
        int result = value +addValue;
        return new ImmutableObj(result); // 더하고 새로운 인스턴스에 결과 대입, 그러면 value 값은 유지가 된다.
    }

    public int getValue() {
        return value;
    }
}
