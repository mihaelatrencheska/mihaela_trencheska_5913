package management;

class Member {
    private String id;
    private String name;
    private String membershipType;
    private int age;

    // Constructor
    public Member(String id, String name, String membershipType, int age) {
        this.id = id;
        this.name = name;
        this.membershipType = membershipType;
        this.age = age;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Membership Type: " + membershipType + ", Age: " + age;
    }
}