package lang.immutable.change;

public class MutableMain {
    public static void main(String[] args) {

        MutableObj obj = new MutableObj(10);
        obj.add(20); // value = 10 + 20

        System.out.println("obj = "+ obj.getValue()); // 값이  쌓인다.
    }
}
