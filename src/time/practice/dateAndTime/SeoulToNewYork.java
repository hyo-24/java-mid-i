package time.practice.dateAndTime;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class SeoulToNewYork {

    public static void main(String[] args) {


        ZonedDateTime seoul = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
        ZonedDateTime ny = ZonedDateTime.now(ZoneId.of("America/New_York"));

        long between = Math.abs(ChronoUnit.HOURS.between(seoul.toLocalDateTime(), ny.toLocalDateTime()));
        System.out.println("서울과 뉴욕의 시차는 "+between+"시간입니다.");

    }
}
