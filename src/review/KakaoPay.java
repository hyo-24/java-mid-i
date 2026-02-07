package review;

public class KakaoPay extends Payment{

    public String name = "Kakao";

    @Override
    String pay(int amount) {
        return "KakaoPay : "+ amount;
    }


    static String nameTag() {
        return "KakaoPay";
    }
}
