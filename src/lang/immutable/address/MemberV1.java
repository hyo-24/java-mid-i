package lang.immutable.address;

public class MemberV1 {

    private String name;
    private Address address; // 필드가 인스턴스다.

    public MemberV1(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Address getAddress() { // 필드가 인스턴스인데 private 이라서 외부에서 변경 불가능! 그래서 직접 찾아감
        return address; // 참조값을 반환해서 Address의 메서드에 접근하게 한다.
    }

    public void setAddress(Address address) { //
        this.address = address;
    }

    @Override
    public String toString() {
        return "MemberV1{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
