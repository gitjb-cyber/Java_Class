package student;

public class Test02 {
    public static void main(String[] args) {

        StudentHashMap studentHashMap = new StudentHashMap();

        Student st01 = new Student(1001, "이순신");
        Student st02 = new Student(1001, "홍길동"); // 중복
        Student st03 = new Student(1002, "김유신");
        Student st04 = new Student(1002, "이순신"); // 중복
        Student st05 = new Student(1003, "강감참");
        Student st06 = new Student(1004, "강감참"); // 중복


        studentHashMap.addStudent(st01);
        studentHashMap.addStudent(st02);
        studentHashMap.addStudent(st03);
        studentHashMap.addStudent(st04);
        studentHashMap.addStudent(st05);
        studentHashMap.addStudent(st06);

        studentHashMap.printAll();

        studentHashMap.removeStudent(1003);
        studentHashMap.printAll();


    }
}
