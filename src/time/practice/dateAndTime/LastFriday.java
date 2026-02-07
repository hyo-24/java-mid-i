package time.practice.dateAndTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class LastFriday {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now().plusMonths(1);
        LocalDate lastF = now.with(TemporalAdjusters.lastInMonth(DayOfWeek.FRIDAY));
        System.out.println("다음달의 마지막 금요일은 "+lastF);
    }
}
