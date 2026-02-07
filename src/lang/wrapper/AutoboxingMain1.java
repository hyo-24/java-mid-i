package lang.wrapper;

public class AutoboxingMain1 {

    public static void main(String[] args) {

        int value = 7;

        Integer i = Integer.valueOf(value);

        int unboxValue = i.intValue();

        System.out.println("i = "+ i);
        System.out.println("unboxValue = "+ unboxValue);
    }
}
