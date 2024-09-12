package student;

public class Test {
    public static void main(String[] args) {
        StudentHashSet studentHashSet = new StudentHashSet();

        Student st01 = new Student(1001, "이순신");
        Student st02 = new Student(1001, "홍길동"); // 중복
        Student st03 = new Student(1002, "김유신");
        Student st04 = new Student(1002, "이순신"); // 중복
        Student st05 = new Student(1003, "강감참");

        studentHashSet.addStudent(st01);
        studentHashSet.addStudent(st02);
        studentHashSet.addStudent(st03);
        studentHashSet.addStudent(st04);
        studentHashSet.addStudent(st05);

        studentHashSet.printAll();

        studentHashSet.removeStudent(1002);
        studentHashSet.printAll();

    }


}
