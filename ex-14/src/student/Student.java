package student;

/*
 - 변수 : studentId, name
 - getter/setter/toString 재정의
 - studentId 를 기준으로 중복검사 할 수 있게 hashCode()와 equals() 메서드 재정의

 - studentHashSet 클래스
 - studentHashMap 클래스

 각각 addStudent, removeStudent, printAll 메서드 구현
*/

public class Student {
    private int studentId;
    private String name;

    public Student(int studentId, String name){
        this.studentId = studentId;
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode(){
        return studentId;
    }


    // 중복인지 검사하는 2가지
    // 1) hashCode 비교 2) equals 메서드로 비교
    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof Student){
            Student student = (Student) obj;
            if (this.studentId == student.studentId) {
                return true;  // 중복
            }else {
                return false; // 중복 아님
            }
        }
        return false;
    }

    @Override
    public String toString(){
        return studentId + " / " + name;
    }
}
