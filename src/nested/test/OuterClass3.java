package nested.test;

public class OuterClass3 {

   public void myMethod() {

       class LocalClass { // 지역 클래스 ➡️ 메서드가 실행이 끝나면 스택(작업대)에서 삭제된다.

           public void hello() {
               System.out.println("NestedClass.hello");
           }
       }
       LocalClass localClass = new LocalClass(); // 외부 메서드 안에 지역 클래스 객체 생성하고 메서드 호출까지
       localClass.hello();
   }
} // 생성만 하고 반환 ➡️ 나중에 호출 VS 같은 메서드 안에서 생성 + 호출 (이 두개가 헷갈렸다)