import java.util.HashSet;
import java.util.Iterator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

        // 자료를 관리하는 컬렉션
        // 순차적으로 관리해주는 - List : 인터페이스 - 구현 - ArrayList, LinkedList
        // 중복된 자료 저장X - set : 인터페이스 - 구현 : HashSet


    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<String>();

        // hashSet 을 만들면, 객체로 저장하는 것이 좋음
        hashSet.add("이몽룡");
        hashSet.add(new String("이순신"));
        hashSet.add(new String("김유신"));
        hashSet.add(new String("홍길동"));
        hashSet.add(new String("이순신"));
        hashSet.add(new String("김유신"));
        hashSet.add(new String("이순신"));
        hashSet.add(new String("강감찬"));

        System.out.println(hashSet);

        Iterator<String> ir = hashSet.iterator();

        while (ir.hasNext()) {
            System.out.println(ir.next());
        }

    }
}