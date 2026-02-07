package enumeration.ex3;

public class EnumRefMain {
    public static void main(String[] args) {
        System.out.println("class BASIC = "+ Grade.BASIC.getClass());
        System.out.println("class GOLD = "+ Grade.GOLD.getClass());
        System.out.println("class DIAMOND = "+ Grade.DIAMOND.getClass());

        System.out.println("ref BASIC = "+ refValue(Grade.BASIC));
        System.out.println("ref GOLD = "+ refValue(Grade.GOLD));
        System.out.println("ref DIAMOND = "+ refValue(Grade.DIAMOND)); // 클래스는 같지만 다른 인스턴스다. 상수를 쓰기만해도 인스턴스가 생성된다..!
    }

    private static String refValue(Object grade) {
        return Integer.toHexString(System.identityHashCode(grade));
    }
}
