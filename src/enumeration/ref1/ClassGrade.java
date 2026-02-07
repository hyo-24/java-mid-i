package enumeration.ref1;

public class ClassGrade { // enum 과 같은 역할을 하는 클래스

    public static final ClassGrade BASIC = new ClassGrade(10); // 앞에서는 객체 생성만 했지 초기화 하지는 않았었다!
    public static final ClassGrade GOLD = new ClassGrade(20);
    public static final ClassGrade DIAMOND = new ClassGrade(30);

    private final int discountPercent; // 이 클래스의 필드

    private ClassGrade(int discountPercent) { // 생성자
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent; // 필드 값 꺼내기
    }

}
