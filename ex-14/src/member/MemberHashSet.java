package member;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
    private HashSet<Member> hashSet;

    public MemberHashSet() {
        hashSet = new HashSet<Member>();
    }

    public void addMember(Member member) {
        hashSet.add(member);
    }

    // memberId 를 찾아서 삭제
    public boolean removeMember(int memberId) {
        // Iterator 로 순회하면서 memberId가 같은 객체를 찾으면
        // 해당 객체를 remove 메서드를 통해 hashSet 에서 삭제한다.
        // 정상적으로 삭제 되면 true 반환 / 찾는 값이 없으면 false 반환

        Iterator<Member> ir = hashSet.iterator();
        while (ir.hasNext()) {
            Member member = ir.next();
            int currentId = member.getMemberId();
            if (currentId == memberId) {
                hashSet.remove(member);
                return true;
            }
        }
        return false;
    }

    // Iterator 로 순회하면서 각 객체를 출력하는 printAll 메서드를 정의하시오.
    public void printAll(){
        Iterator<Member> ir = hashSet.iterator();
        while (ir.hasNext()) {
            System.out.println(ir.next());
        }
    }

    // 향상된 for 문으로 각 객체를 출력하는 showAllData 메서드를 정의하시오.
    public void showAllData(){
        for(Member member : hashSet){
            System.out.println(member);
        }
    }
}