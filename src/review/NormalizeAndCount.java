package review;

import java.util.Scanner;

public class NormalizeAndCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력");
        String m = scanner.nextLine();

        String stringOnly = m.replaceAll("[^a-zA-Z]", " "); // 알파벳 빼고 나머지는 공백 처리
        String trim = stringOnly.replaceAll("\\s+", " "); // 다중 공백 단일 공백으로 처리
        String result = trim.toLowerCase().trim(); // 소문자로 처리하고 앞뒤 공백 제거

        String[] words = result.split("\\s+"); // 공백 기준으로 문자열 나누기

        String[] unique = new String[words.length]; // 나눠진 문자열 개수만큼 unique 배열 생성
        int[] counts = new int[words.length]; // 단어 개수 배열 생성
        int size = 0;

        // 정리한 문자열 배열을 문자열 별로 구별해서 정리하기
        for (String word : words) {
            boolean found = false;

            // 중복체크 반복문
            for (int i = 0; i < size; i++) { // 첫번째는 size 가 0이니까 실행되지 않고 아래의 조건문으로 간다. (i++ 을 하지 않음)
                if (unique[i].equals(word)) { // 두번째에서는 size = 1, i = 0 이니까 실행이된다. 두번째 문자열과 unique[0] 의 문자열을 비교한다.
                    counts[i]++; // 각 단어가 몇 번 등장했는지 세는 용도, 동일한게 있으면 배열에 넣는게 아니라 이 변수를 증가시킴
                    found = true;
                    break;
                }
            }
            // 없는 단어 배열에 넣기
            if (!found) { // 단어를 넣는 역할 (처음에 0 일 때는 found가 변경되지 않았으니까 false 맞음)
                unique[size] = word; // 이때 unique의 배열에 값이 들어간다. unique[0] = 첫번째 문자열
                counts[size] = 1;
                size++;
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.println(unique[i]+" : "+ counts[i]); // 배열을 전부 출력하게 한다.
        }
    }
}
