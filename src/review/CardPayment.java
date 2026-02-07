package review;

public class CardPayment extends Payment {

    String name = "Card";

    @Override
    public double feeRate() {
        return 0.02;
    }

    @Override
    String pay(int amount) {
        return "CardPay : "+amount;
    }

    @Override
    CardPayment cloneSwallow() { // 공변 변환 :  오버라이딩 할 때 메서드 타입을 자식타입으로 변경
        return this;
    }

    static String nameTag() {
        return "CardPayment";
    }


}
