package lang.immutable.test;

public class MyDateMain {
    public static void main(String[] args) {

        MyDate date1 = new MyDate(2025, 8, 14);
        MyDate date2 = date1;
        System.out.println("date1 = "+date1);
        System.out.println("date2 = "+date2);

        System.out.println("2026 -> date1");
        date1.setYear(2026);
        System.out.println("date1 = "+date1);
        System.out.println("date2 = "+date2);
    }
}
