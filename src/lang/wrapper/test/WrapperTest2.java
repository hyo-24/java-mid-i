package lang.wrapper.test;

public class WrapperTest2 {
    public static void main(String[] args) {
        String[] array = {"1.5", "2.5", "3.0"};

        double sum = 0; // 밖에 초기화 해두고
        for (String s : array) { // 배열 값 꺼낼 때는 항상 for-each 문 사용
            Double i = Double.parseDouble(s);
            sum+= i; //  누적
        }
        System.out.println("sum = "+ sum);

    }
}
