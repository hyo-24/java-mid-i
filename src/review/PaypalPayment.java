package review;

public class PaypalPayment extends Payment {

    public String name = "Paypal";

    @Override
    String pay(int amount) {
        return "PaypalPayment : "+ amount;
    }


    static String nameTag() {
        return "PaypalPayment";
    }
}

