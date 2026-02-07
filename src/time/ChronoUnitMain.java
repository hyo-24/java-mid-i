package time;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitMain {

    public static void main(String[] args) {
        ChronoUnit[] values = ChronoUnit.values();
        for (ChronoUnit value : values) {
            System.out.println("value = "+value);
        }
        System.out.println("HOURS = " + ChronoUnit.HOURS);
        System.out.println("HOURS.duration = "+ChronoUnit.HOURS.getDuration().getSeconds());
        System.out.println("DAYS = "+ChronoUnit.DAYS);
        System.out.println("DAYS.duration = "+ChronoUnit.DAYS.getDuration().getSeconds());

        LocalTime It1 = LocalTime.of(1, 10, 0);
        LocalTime It2 = LocalTime.of(1, 20, 0);

        long secondsBetween = ChronoUnit.SECONDS.between(It1, It2);
        System.out.println("secondsBetween ="+secondsBetween);

        long minutesBetween = ChronoUnit.MINUTES.between(It1, It2);
        System.out.println("minutesBetween = "+minutesBetween);
    }
}
