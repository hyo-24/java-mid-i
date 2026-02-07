package time.practice.dateAndTime;

import java.time.LocalDate;
import java.time.Period;

public class NextFewDays {

    public static void main(String[] args) {

        Period plusDate = Period.of(1, 2, 15);
        LocalDate result = LocalDate.now().plus(plusDate);
        System.out.println("오늘부터 1년 2개월 15일 후는 "+result+"입니다.");
    }
}
