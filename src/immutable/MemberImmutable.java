package immutable;

public class MemberImmutable {
    private String name;
    private MemberImmutable address;

    public MemberImmutable(String name, MemberImmutable address) {
        this.name = name;
        this.address = address;
    }


}
