package nested.nested;

public class NestedOuter { // 중첩 클래스에서 바깥 클래스의 속성을 사용하려면 static이 붙은 것만 가능하구나

    private static int outClassValue = 3; // 정적 멤버 변수 -> 클래스에 속함
    private int outInstanceValue = 2; // 동적 멤버 변수

    static class Nested{ // 정적 중첩 클래스 (외부 멤버 x )
        private int nestedInstanceValue = 1;

        public void print() {
            System.out.println(nestedInstanceValue);

            //System.out.println(outInstanceValue);️ 바깥 클래스의 인스턴스 멤버에는 접근할 수 없다.

            System.out.println(NestedOuter.outClassValue); // 바깥 클래스의 클래스 멤버(static)에는 접근 할 수 있다. private도 가능
        }
    }
}
