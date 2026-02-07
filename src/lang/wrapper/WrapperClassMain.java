package lang.wrapper;

public class WrapperClassMain {

    public static void main(String[] args) {
        Integer newInteger = new Integer(10); // 빨간줄은 자바가 더 이상 권장하지 않는 부분이라서. 안에 toString() 이 오버라이딩 돼있음

        Integer integerObj = Integer.valueOf(10); // 위의 코드와 동작이 같다. Integer.valueOf() 메서드는 해당 값이 있는 인스턴스가 없으면 생성해서 반환한다.

        Long longObj = Long.valueOf(100); // String 에서의 valueOf()는 이름만 같을 뿐 다른 메서드다.
        Double doubleObj = Double.valueOf(10.5);

        System.out.println("newInteger = "+newInteger);
        System.out.println("integerObj = " + integerObj);
        System.out.println("longObj = "+ longObj);
        System.out.println("doubleObj = "+ doubleObj);

        System.out.println("내부 값 읽기");
        int intValue = integerObj.intValue();
        System.out.println("intValue = "+ intValue);
        long longValue = longObj.longValue();
        System.out.println("longObj = "+longObj);

        System.out.println("비교");
        System.out.println("== : "+ (newInteger == integerObj));
        System.out.println("equals : " + newInteger.equals(integerObj));

    }
}
