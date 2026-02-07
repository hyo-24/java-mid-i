package lang.immutable.address;

public class MemberMainV2 {
    public static void main(String[] args) {

        ImmutableAddress address = new ImmutableAddress("서울"); // 타입을 Address 에서 ImmutableAddress 로 변경

        MemberV2 member1 = new MemberV2("회원1",address);
        MemberV2 member2 = new MemberV2("회원2",address);

        System.out.println("member1 = " + member1);
        System.out.println("member2 = " + member2);

        member2.setAddress(new ImmutableAddress("부산"));
        System.out.println("부산 -> member2.address");
        System.out.println("member1 = "+member1);
        System.out.println("member2 = "+member2);
    }
}
