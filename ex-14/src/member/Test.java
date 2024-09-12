package member;

import java.util.HashSet;
import java.util.Iterator;

public class Test {

    // 중복데이터를 검사할 때, hash 코드가 같은지 여부를 검사
    // 내용이 같아도 hash 코드가 다르면 중복으로 처리X
    // 그래서 hash 코드와 equal 메서드를 재정의해서 사용한다.

    public static void main(String[] args) {

        Member mem01 = new Member(100, "이순신");
        Member mem02 = new Member(200, "홍길동");
        Member mem03 = new Member(300, "이순신");

        MemberHashSet memberHashSet = new MemberHashSet();

        memberHashSet.addMember(mem01);
        memberHashSet.addMember(mem02);
        memberHashSet.addMember(mem03);

        memberHashSet.showAllData();

/*
        HashSet<Member> memberSet = new HashSet<Member>();

        memberSet.add(mem01);
        memberSet.add(mem02);
        memberSet.add(mem03);

        System.out.println(memberSet);

        Iterator<Member> ir = memberSet.iterator();

        while (ir.hasNext()) {
            System.out.println(ir.next().hashCode());
        }

 */
    }
}
