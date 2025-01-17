package management;

class Member {
    private String id;
    private String name;
    private String membershipType;
    private int age;

    public Member(String id, String name, String membershipType, int age) {
        this.id = id;
        this.name = name;
        this.membershipType = membershipType;
        this.age = age;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getMembershipType() { return membershipType; }
    public int getAge() { return age; }

    @Override
    public String toString() {
        return "Member{" +
                "ID='" + id + '\'' +
                ", Name='" + name + '\'' +
                ", Membership Type='" + membershipType + '\'' +
                ", Age=" + age +
                '}';
    }
}