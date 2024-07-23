package immutable;

public class MutableMain {
    public static void main(String[] args) {
        Address address = new Address("서울");

        MemberMutable m1 = new MemberMutable("A", address);

        m1.getAddress().setValue("부산");

    }
}
