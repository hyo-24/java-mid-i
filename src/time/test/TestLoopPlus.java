package time.test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TestLoopPlus {
    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2024, 1, 1 );
        for (int i = 0; i < 5; i++) {
            LocalDate nextDate = date.plus(2 * i,ChronoUnit.WEEKS ); // plus ( 더할 숫자 , 더할 날짜단위 )
            System.out.println("날짜 "+(i+1)+" : "+nextDate);
        }
    }
}
