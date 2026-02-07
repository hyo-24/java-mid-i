package nested.test;

public class OuterClass2Main {

    public static void main(String[] args) {

        OuterClass2 class2 = new OuterClass2();
        OuterClass2.NestedClass nestedClass = class2.new NestedClass();

        nestedClass.hello();
    }
}
