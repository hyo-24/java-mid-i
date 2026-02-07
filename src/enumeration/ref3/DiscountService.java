package enumeration.ref3;


public class DiscountService {

    public int discount(Grade grade, int price) {
        return grade.discount(price); // Grade 객체 안의 메서드로 계산해서 반환
    }
}
