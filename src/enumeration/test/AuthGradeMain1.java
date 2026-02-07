package enumeration.test;

public class AuthGradeMain1 {
    public static void main(String[] args) {

        AuthGrade[] grades = AuthGrade.values();
        print(AuthGrade.GUEST);
        print(AuthGrade.LOGIN);
        print(AuthGrade.ADMIN);

    }

    private static void print(AuthGrade grade) {
        System.out.println("grade = "+ grade.name()+", level = "+ grade.getLevel() +", 설명 : "+ grade.getDescription());
    }
}
