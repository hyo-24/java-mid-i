package time.practice.method_class;

public class Circle {

    public static void main(String[] args) {
        int radius = 6;

        getArea(radius);
    }

    private static void getArea(int radius) {
        double result = radius * radius * 3.14;
        System.out.println("원의 넓이 : "+result);
    }

}


