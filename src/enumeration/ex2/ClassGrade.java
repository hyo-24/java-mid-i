package enumeration.ex2;

public class ClassGrade { // 회원등급을 다루는 클래스
    public static final ClassGrade BASIC = new ClassGrade(); // 상수에 인스턴스 생성해서 대입
    public static final ClassGrade GOLD = new ClassGrade();
    public static final ClassGrade DIAMOND = new ClassGrade();

    private ClassGrade() { } // 생성자, 외부에서 이 클래스 객체 생성을 막음
}
