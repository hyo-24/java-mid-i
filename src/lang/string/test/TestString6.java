package lang.string.test;

public class TestString6 {

    public static void main(String[] args) {

        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";
        int count = 0;

        int index = str.indexOf(key); // 여기서 key 에 해당하는 문자열을 못찾으면 -1 이 출력된다.

        while (index >= 0) { // hello 가 있으면 -1 이 아니니까 참이 된다.
            index = str.indexOf(key,index+1);
            count++;
        }
        System.out.println("count = "+count);
    }  // indexOf(이 문자열을, 이 인덱스 부터 검색) 해서 시작위치를 반환한다. 그러면 다음 반복문에서 이 index 값이 indexOf의 검색 위치가 된다.
} //  이렇게 계속 반복문이 돌아가고 만약 없으면 -1 이라서 조건이 거짓이라 종료된다.
