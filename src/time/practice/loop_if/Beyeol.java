package time.practice.loop_if;

public class Beyeol {

    public static void main(String[] args) {

        int[] scores = {90,70,50,100,65};

        int a = scores[0]; // 현재까지의 최댓값을 저장하는 변수, 밖에서 초기화되서 안의 반복문에 영향끼치지 않음
        for (int i = 0; i < scores.length; i++) {

            if (a < scores[i]) {
                a = scores[i]; // a에 더 큰 값이 대입되고 반복문을 다시 그대로 돈다
            }
        }

        System.out.println("배열의 최댓값은 "+a);
    }
}
