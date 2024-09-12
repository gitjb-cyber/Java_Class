package member;

public class Test02 {
    public static void main(String[] args) {

        MemberHashMap memberHashMap = new MemberHashMap();

        Member mem01 = new Member(1001, "이순신");
        Member mem02 = new Member(1002, "홍길동");
        Member mem03 = new Member(1003, "김유신");
        Member mem04 = new Member(1004, "강감찬");

        memberHashMap.addMember(mem01);
        memberHashMap.addMember(mem02);
        memberHashMap.addMember(mem03);
        memberHashMap.addMember(mem04);

        memberHashMap.showAllMember();

        memberHashMap.removeMember(1004);
        memberHashMap.showAllMember();
    }
}
