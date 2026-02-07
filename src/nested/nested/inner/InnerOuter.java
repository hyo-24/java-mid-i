package nested.nested.inner;

public class InnerOuter {

    private static int outClassValue = 3; // 클래스 멤버
    private int outInstanceValue = 2; // 인스턴스 멤버

    class Inner { // 내부 클래스
        private int innerInstanceValue = 1; // 내부 인스턴스 멤버

        public void print() {
            System.out.println(innerInstanceValue); // 본인 멤버 호출 가능

            System.out.println(outInstanceValue); // 외부 클래스의 인스턴스 멤버에 접근 가능 ‼️ (중첩 클래스와의 차이점)

            System.out.println(InnerOuter.outClassValue); // 외부 클래스의 클래스 멤버에 접근 가능
        }
    }
}
