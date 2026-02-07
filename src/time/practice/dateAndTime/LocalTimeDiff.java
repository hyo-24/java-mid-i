package time.practice.dateAndTime;

import java.time.*;


public class LocalTimeDiff {

    public static void main(String[] args) {

        ZonedDateTime seoul = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
        ZonedDateTime france = ZonedDateTime.now(ZoneId.of("Europe/Paris"));

        // LocalDateTime.now(), ZoneId.of("") ➡️ 계산하면 시차처럼 차이가 나지만 동일한 순간이 아니다!

        // ZonedDateTime 은 내부적으로 항상 절대시각(Instant) + 타임존 을 같이 들고 있다.
        // 그래서 now로 하면 같은 Instant로 이 둘의 차이를 비교하면 0 이 나오는 것이다. 그래서 오프셋을 사용해야하는데 오프셋은 초단위만 사용가능
        // 이런 이유로 직접 시간 단위를 초로 변경해서 나눠줄 수 밖에 없다.

        int diff = france.getOffset().getTotalSeconds()-seoul.getOffset().getTotalSeconds();
        long hours = Math.abs(diff/3600);

        System.out.println("서울과 파리의 시차는 "+hours+"시간입니다.");
    }
}
