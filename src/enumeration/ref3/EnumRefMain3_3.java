package enumeration.ref3;

public class EnumRefMain3_3 {
    public static void main(String[] args) {
        int price = 10000;

        Grade[] grades = Grade.values(); // 배열로 객체들 싹 가져와서
        for (Grade grade : grades) { // 배열과 price 로 호출을 반복한다.
            printDiscount(grade,price);
        }
    }

    private static void printDiscount(Grade grade, int price) {
        System.out.println(grade.name() + " 등급의 할인 금액 : "+ grade.discount(price)); // 출력마다 달라지는 이름은 name() 으로 해결했다
    }
}
