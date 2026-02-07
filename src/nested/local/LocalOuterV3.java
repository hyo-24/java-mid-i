package nested.local;

import java.lang.reflect.Field;


public class LocalOuterV3 {

    private int outInstanceVar = 3;

    public Printer process(int paramVar) {

        int localVar = 1;

        class LocalPrinter implements Printer {

            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);

                // 인스턴스 변수는 지역 변수보다 오래 살아남는다. (지역변수와 필드는 다르다. 원래 지역변수는 인스턴스에 저장되지 않는다.)

                System.out.println("localVar = " + localVar); // 지역 클래스에서 지역 변수를 사용함 ➡️ 변수 캡쳐 실행!!!
                System.out.println("paramVar = " + paramVar);

                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        Printer printer = new LocalPrinter(); // 지역클래스 객체 생성
        return printer; // 인스턴스를 반환한다.
    }

    public static void main(String[] args) {

        LocalOuterV3 localOuter = new LocalOuterV3(); // 외부 클래스 생성
        Printer printer = localOuter.process(2); // 반환한 인스턴스를 받아서 메서드를 실행한다.
        printer.print();

        System.out.println("필드 확인");
        Field[] fields = printer.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = "+field);
        }
    }
}
