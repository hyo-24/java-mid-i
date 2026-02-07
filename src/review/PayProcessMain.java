package review;

public class PayProcessMain {

    public static void main(String[] args) {

        Payment a = new CardPayment();
        Payment b = new KakaoPay();
        Payment c = new PaypalPayment();

        PaymentProcessor pr = new PaymentProcessor();

        // 1) 오버로딩 선택 + 오버라이딩 실행
        System.out.println(pr.process(a, 100));          // (A)
        System.out.println(pr.process((CardPayment)a, 200)); // (B)
        System.out.println(pr.process(b, 300));          // (C)
        System.out.println(pr.process(c, 400));          // (D)

        // 2) 필드 숨김 vs 메서드 다형성
        System.out.println(a.name + "," + ((CardPayment)a).name); // (E)

        // 3) default vs override
        System.out.println(b.feeRate() + "," + c.feeRate());      // (F)

        // 4) 공변 반환
        Payment cloned = a.cloneSwallow();
        System.out.println(cloned.getClass().getSimpleName());    // (G)

        // 5) static 숨김 확인 + 런타임 분기
        System.out.println(pr.tagOf(a)); // (H1)
        System.out.println(pr.tagOf(b)); // (H2)
        System.out.println(pr.tagOf(c)); // (H3)
    }
}
