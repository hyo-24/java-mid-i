package time.practice.dateAndTime;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class NextBirth {

    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        LocalDate birth = LocalDate.of(now.getYear(), 12, 25);
        if (!birth.isAfter(now)) {
            birth = birth.plusYears(1);
        }

        long daysBetween = ChronoUnit.DAYS.between(now,birth);

        System.out.println("다음 크리스마스까지는 "+daysBetween+"일 남았습니다.");

    }
}
