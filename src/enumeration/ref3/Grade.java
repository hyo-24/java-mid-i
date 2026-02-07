package enumeration.ref3;

public enum Grade {
    BASIC(10), GOLD(20), DIAMOND(30); // 상수 초기화

    private final int discountPercent;

    Grade(int discountPercent) { // 생성자
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() { // 메서드
        return discountPercent;
    }

    public int discount(int price) {
        return price * discountPercent / 100;
    }
}
 