package time.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestBetween {
    public static void main(String[] args) {

        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 11, 21);

        Period period = Period.between(startDate, endDate); // 날짜의 간격은 period로!!
        long daysBetween = ChronoUnit.DAYS.between(startDate,endDate); // ChronoUnit 은 초단위로만 표현할 수 있기 때문에 long 사용
        // 시간이나 날짜를 조작할 때 사용하는 ChronoUnit 클래스

        System.out.println("시작 날짜 : "+startDate);
        System.out.println("목표 날짜 : " + endDate);
        System.out.println("남은 기간 : "+period.getYears()+"년 "+period.getMonths()+"월 "+period.getDays()+"일 ");
        // period 의 날짜는 한번에 출력되는게 아니라 하나하나 날짜단위씩 가져와서 출력해야한다.

        System.out.println("디데이 : "+daysBetween +"일 남음");
    }
}
