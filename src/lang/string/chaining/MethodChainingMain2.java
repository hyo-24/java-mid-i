package lang.string.chaining;

public class MethodChainingMain2 {

    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        ValueAdder adder1 = adder.add(1); // 인스턴스는 하나만 생성됐다. 메서드의 반환값을 대입받아 참조값을 가지게 된다.
        ValueAdder adder2 = adder.add(2);
        ValueAdder adder3 = adder.add(3);
        int result = adder3.getValue();
        System.out.println("result = " + result);
    }
}
