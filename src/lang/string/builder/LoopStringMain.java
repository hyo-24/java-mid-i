package lang.string.builder;

public class LoopStringMain {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        //String result = "";
        for (int i = 0; i < 100000; i++) { // 반복문에서 계속 문자열 더하기
            //result += "Hello Java ";
            sb.append("Hello Java");
        }
        String result = sb.toString();
        long endTime = System.currentTimeMillis();

        System.out.println("result = "+ result);
        //System.out.println("result = " + result);
        System.out.println("time = "+ (endTime - startTime)+"ms");

    }
}
