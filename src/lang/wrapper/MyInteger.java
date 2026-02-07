package lang.wrapper;

public class MyInteger {

    private final int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() { // 필드 값이 필요할 때
        return value;
    }

    public int compareTo(int target) { // 가지고 있는 기능
        if (value < target) {
            return -1;
        } else if (value > target) {
            return 1;
        } else  {
            return 0;
        }
    }

    @Override
    public String toString() { // 해당 필드 값이 문자열로 필요할 때 호출해서 사용함
        return String.valueOf(value);
    }
}
