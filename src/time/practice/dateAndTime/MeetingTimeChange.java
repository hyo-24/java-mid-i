package time.practice.dateAndTime;

import java.time.*;

public class MeetingTimeChange {

    public static void main(String[] args) {
        ZonedDateTime seoul = ZonedDateTime.of(LocalDateTime.of(2025,9,8,15,0),ZoneId.of("Asia/Seoul"));
        // ZonedDateTime 은 날짜와 시간 그리고 타임존이 있어야한다!!! 그래서 생성할 때도 이것들을 다 넣어줘야 함!!!
        ZonedDateTime ny = seoul.withZoneSameInstant(ZoneId.of("America/New_York"));
        ZonedDateTime ld = seoul.withZoneSameInstant(ZoneId.of("Europe/London"));

        LocalDateTime nyT = ny.toLocalDateTime();
        LocalDateTime seoulT = seoul.toLocalDateTime();
        LocalDateTime ldT = ld.toLocalDateTime();

        System.out.println("서울 : "+seoulT);
        System.out.println("뉴욕 : "+nyT);
        System.out.println("런던 : "+ldT);

    }

}
