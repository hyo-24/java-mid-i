package review.ex5;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class EventMain {

    public static void main(String[] args) {

        // 다음 달의 마지막 토요일을 구하기
        LocalDate now = LocalDate.now().plusMonths(1); // 다음 달을 만드는 법을 기억 못했다.
        LocalDate date = now.with(TemporalAdjusters.lastInMonth(DayOfWeek.SATURDAY));
        System.out.println(date);

        // 행사 시간을 변경하기
        LocalDateTime dateTime = date.atTime(14, 0); // atTime() 메서드를 기억 못함

        // 행사일 만든 형식의 문자열로 출력하기
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm");
        System.out.println("행사일 : "+dateTime.format(formatter)); // 문자열 형태를 적용하는 메서드 : format() 기억하자

        // 현재와 행사일의 남은 기간 구하기
        LocalDateTime now1 = LocalDateTime.now();
        Duration between = Duration.between(now1, dateTime);

        // Duration은 초단위로 반환된다. 그래서 단위별로 바꿔줌.
        long days = between.toDays();
        long hours = between.toHours() % 24;

        System.out.println("행사까지 남은 기간 : "+days+"일 "+hours+"시간");

    }
}
