package review;

public class PointMain {

    public static void main(String[] args) {

        Point p1 = new Point(1,2);
        Point p2 = p1.move(3,4);

        System.out.println(p1);
        System.out.println(p2);
    }
}
