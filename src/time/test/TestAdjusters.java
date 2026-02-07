package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class TestAdjusters {
    public static void main(String[] args) {
        int year = 2024;
        int month = 1;

        LocalDate date = LocalDate.of(year, month, 1);
        DayOfWeek firstDayOfWeek = date.getDayOfWeek();
        DayOfWeek lastDayOfWeek = date.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek();
        // TemporalAdjusters 는 날짜와 시간을 읽을 수 있는 클래스다.
        // with() 메서드는 날짜와 시간의 특정 필드를 변경할 수 있는 메서드다.
        // date 의 날짜를 읽어서 그 달의 마지막날을 반환하고, 요일을 확인한다.

        System.out.println("firstDayOfWeek = "+firstDayOfWeek);
        System.out.println("lastDayOfWeek = "+lastDayOfWeek);

    }
}
