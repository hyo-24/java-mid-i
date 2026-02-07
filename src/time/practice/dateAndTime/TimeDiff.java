package time.practice.dateAndTime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeDiff {
    public static void main(String[] args) {

        ZonedDateTime parisT = ZonedDateTime.of(LocalDateTime.of(2025, 12, 31, 23, 0), ZoneId.of("Europe/Paris"));
        ZonedDateTime seoul = parisT.withZoneSameInstant(ZoneId.of("Asia/Seoul"));

        System.out.println("현재 서울의 시간은 "+seoul);
    }
}
