package immutable;

public class MemberMutable {
    private String name;
    private Address address;

    public MemberMutable(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Address getAddress(){
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "MemberMutable{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}


