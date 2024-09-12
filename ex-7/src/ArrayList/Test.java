package ArrayList;

public class Test {
    public static void main(String[] args) {

        School school = School.getInstance();

        school.addStudent(1003, "홍 ");
        school.addStudent(1004, "강 ");


        // school.getStudentList() = studentList
        // 자료형 ArrayList
        // 값을 가져올 때 get 메서드 사용

        Student st01 = school.getStudentList().get(0);
        Student st02 = school.getStudentList().get(1);
        System.out.println(st01);

        // 첫번째 학생에게 추가
        // school.getStudentList().get(0) == 0번 Student 객체를 가져오는 것
        school.getStudentList().get(0).addSubject("국어", 100);

        // 두번째 학생에게 추가
        // 객체를 중간에 변수에 담아서 사용
        Student stGang = school.getStudentList().get(1); // student 객체
        stGang.addSubject("영어", 85);

        // 세번째 - 추가하는 메서드를 만들어서 추가
        // 첫번째 학생에게 추가
        school.addsubject(0, "수학", 75); // index 가 0 - 첫번째 학생 추가
                                                          //
        //          1 - 두번째 학생 추가
        school.showSchoolInfo();

        /*
        Student stLee = new Student(1001, "Lee");
        Student stKim = new Student(1002, "Kim");

        stLee.addSubject("국어", 100);
        stLee.addSubject("수학", 80);

        stKim.addSubject("국어", 95);
        stKim.addSubject("영어", 85);

        stLee.showStudentInfo();
        System.out.println("-----------------------");
        stKim.showStudentInfo();
         */
    }
}