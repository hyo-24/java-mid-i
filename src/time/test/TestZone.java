package time.test;

import java.time.*;

public class TestZone {
    public static void main(String[] args) {


        ZonedDateTime seoulTime = ZonedDateTime.of(LocalDate.of(2024, 1, 1), LocalTime.of(9, 0, 0), ZoneId.of("Asia/Seoul"));
        // ZoneDateTime 안에 날짜와 시간을 LocalDate 와 LocalTime 으로 설정해서 넣어야 한다.

        ZonedDateTime londonTime = seoulTime.withZoneSameInstant(ZoneId.of("Europe/London"));
        ZonedDateTime nyTime = seoulTime.withZoneSameInstant(ZoneId.of("America/New_York"));

        System.out.println("서울의 회의 시간 : "+seoulTime);
        System.out.println("런던의 회의 시간 : "+londonTime);
        System.out.println("뉴욕의 회의 시간 : "+nyTime);

    }
}
