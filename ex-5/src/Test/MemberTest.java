package Test;

public class MemberTest {
    public static void main(String[] args) {
        Member member01 = new Member(100, "홍길동", 30);
        member01.showMemberInfo();

        Member member02 = new Member(200, "이몽룡", 28);
        member02.showMemberInfo();

        System.out.println("----------");
        System.out.println(member01); // 객체명만 출력 - 자동으로 toString 실행
        System.out.println(member02.toString());
    }
}
