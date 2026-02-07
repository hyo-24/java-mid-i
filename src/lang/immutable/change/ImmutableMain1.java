package lang.immutable.change;

public class ImmutableMain1 {
    public static void main(String[] args) {

        ImmutableObj obj = new ImmutableObj(10);
        ImmutableObj obj1 = obj.add(20); // 먼저 생성된 인스턴스를 통해서 add 메서드 호출!!

        System.out.println("obj = "+ obj.getValue());
        System.out.println("obj = "+ obj1.getValue());
    }
}
