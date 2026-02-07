package enumeration.ref3;


public class EnumRefMain3_0 {

    public static void main(String[] args) {

        int price = 10000;

        // 호출이 조건에 맞는지 비교하고 그에 맞는 할인율을 대입해 계산하는 방법 vs 조건에 그에 맞는 할인율을 대입해두고 호출하면 바로 계산에 돌입하기
        DiscountService discountService = new DiscountService();
        int basic = discountService.discount(Grade.BASIC, price);
        int gold = discountService.discount(Grade.GOLD , price);
        int diamond = discountService.discount(Grade.DIAMOND, price);

        System.out.println("BASIC 등급의 할인 금액 : " + basic);
        System.out.println("GOLD 등급의 할인 금액 : " + gold);
        System.out.println("DIAMOND 등급의 할인 금액 : " + diamond);
    }
}
