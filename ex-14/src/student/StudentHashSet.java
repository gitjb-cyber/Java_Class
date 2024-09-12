package student;

import member.Member;

import java.util.HashSet;
import java.util.Iterator;

public class StudentHashSet {

    private HashSet<Student> hashSet;


    public StudentHashSet(){
        hashSet = new HashSet<Student>();
    }

    public void addStudent(Student student){
        hashSet.add(student);
    }

    public boolean removeStudent(int studentId){

        for (Student student : hashSet){
            if (student.getStudentId() == studentId) {
                hashSet.remove(student);
                return true;
            }
        }

        /*
        Iterator<Student> ir = hashSet.iterator();
        while (ir.hasNext()){
            Student student = ir.next();
            int currentId = student.getStudentId();
            if (currentId == studentId){
                hashSet.remove(student);
                return true;
            }
        }*/
        return false;
    }

    public void printAll(){

       for(Student student : hashSet){
           System.out.println(student);
       }
        /*
        Iterator<Student> ir = hashSet.iterator();

        while (ir.hasNext()) {
            System.out.println(ir.next());
        }

         */
    }
}
