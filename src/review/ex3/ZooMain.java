package review.ex3;

public class ZooMain  {
    public static void main(String[] args) throws ClassNotFoundException {

        String num = "101";

        int i = Integer.parseInt(num);
        int i1 = i + 10;

        Integer integer = Integer.valueOf(i1);

        // 클래스 정보 추출하기
        Class<?> aClass = Class.forName("review.ex3.ZooMain"); // 문자열로 클래스 로딩
        //Class<?> aClass = Class.forName("java.review.ex3.ZooMain");

        System.out.println(aClass == ZooMain.class); // 찾은 클래스와 현재 클래스가 일치하는지 확인


    }
}
