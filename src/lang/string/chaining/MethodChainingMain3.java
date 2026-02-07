package lang.string.chaining;

public class MethodChainingMain3 {

    public static void main(String[] args) {

        ValueAdder adder = new ValueAdder();
        int result = adder.add(1).add(2).add(3).getValue(); // 앞에서 한 포함 관계랑 비슷하네 메서드가 참조값을 담고 있어서 거기다 메서드를 또 호출 할 수 있는 거!
        System.out.println("result = "+ result);
    }
}
