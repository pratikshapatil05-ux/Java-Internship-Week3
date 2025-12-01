class Member {
    private String name;
    private int memberId;

    public Member(String name, int id) {
        this.name = name;
        this.memberId = id;
    }

    public String getMemberInfo() {
        return "Member: " + name + " (ID: " + memberId + ")";
    }
}
