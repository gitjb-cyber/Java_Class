package student;

import java.util.HashMap;
import java.util.Iterator;

public class StudentHashMap {
    HashMap<Integer, Student> hashMap;



    public StudentHashMap(){
        this.hashMap = new HashMap<Integer, Student>();
    }

    public void addStudent(Student student){
        hashMap.put(student.getStudentId(), student);
    }

    public boolean removeStudent(int studentId){

        if (hashMap.containsKey(studentId)) {
            hashMap.remove(studentId);
            return true;
        }
        System.out.println(studentId + "가 없음");
        return false;
    }

    public void printAll(){
        Iterator<Integer> ir = hashMap.keySet().iterator(); // keySet() - 키목록
        while (ir.hasNext()) {
            int key = ir.next();
            Student student = hashMap.get(key); // get(key) : 키에 대한 벨류 가져옴
            System.out.println(student);
        }
        System.out.println("--------");
    }
}
