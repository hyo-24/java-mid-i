package enumeration.ex3;


public class DiscountService {

    public int discount(Grade grade, int price) { // 메서드
        int discountPercent = 0;

        if (grade == Grade.BASIC) { // 등급으로 할인율을 정한다.
            discountPercent = 10;
        } else if (grade == Grade.GOLD) {
            discountPercent = 20;
        } else if (grade == Grade.DIAMOND) {
            discountPercent = 30;
        } else {
            System.out.println("할인 X");
        }

        return price * discountPercent / 100;
    }
}
