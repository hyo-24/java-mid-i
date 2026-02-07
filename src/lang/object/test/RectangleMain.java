package lang.object.test;

public class RectangleMain {
    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle(100,20);
        Rectangle rect2 = new Rectangle(100,20);

        System.out.println(rect1); // 오버라이딩 해야함
        System.out.println(rect2);

        System.out.println(rect1 == rect2); // Object 에 있는거 쓰면 됨
        System.out.println(rect1.equals(rect2)); // 오버라이딩 해야함
    }
}
