package review;

public abstract class Payment implements PaymentMethod{ // 구현하는걸 까먹음

  public String name = "Payment";

    abstract String pay(int amount);

    Payment cloneSwallow() {
        return this;
    }


    static String nameTag() {
        return "Payment";
    }



}
