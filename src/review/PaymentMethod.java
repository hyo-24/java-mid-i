package review;

public interface PaymentMethod {

    default double feeRate() {
        return 0.03;
    }

    static String nameTag() {
        return "PaymentMethod";
    }
}

