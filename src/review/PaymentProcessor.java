package review;

public class PaymentProcessor {

    String process(Payment payment, int amount) {
      return "payment : "+ payment.pay(amount)+" : "+ payment.feeRate();
    }

    String process(CardPayment c, int amount) {
        return "C : "+ c.pay(amount)+" : "+ c.feeRate();
    }

    String tagOf(PaymentMethod m) {
        StringBuilder sb = new StringBuilder();
        sb.append(PaymentMethod.nameTag()).append("|");
        sb.append(Payment.nameTag()).append("|");

        if (m instanceof CardPayment) {
            sb.append(CardPayment.nameTag());
        } else if (m instanceof PaypalPayment) {
            sb.append(PaypalPayment.nameTag());
        } else if (m instanceof KakaoPay) {
            sb.append(KakaoPay.nameTag());
        } else {
            sb.append("UnKnown");
        }
        return sb.toString();
    }
}
