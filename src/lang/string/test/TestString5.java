package lang.string.test;

public class TestString5 {

    public static void main(String[] args) {

        String str = "hello.txt";
        String ext = ".txt";

        int index = str.indexOf(".txt");

        String fileName = str.substring(0,index);
        String extName = str.substring(index); // 마지막 인덱스는 자동으로 문자열 끝으로 정한다.

        System.out.println(fileName);
        System.out.println(extName);

    }
}
