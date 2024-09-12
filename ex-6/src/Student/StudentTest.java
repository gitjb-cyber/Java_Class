package Student;

public class StudentTest {
    public static void main(String[] args) {

        // School school = new School();
        // static 이 붙으면 객체를 생성하지 않고도, 호출하여 실행가능
        // school 에 대한 객체가 생성된적이 없기 때문에
        // 클래스명.메서드명();과 같은 형식으로 호출 가능
        School school = School.getSchool();
        School school2 = School.getSchool();

        System.out.println(school);
        System.out.println(school2);
        System.out.println("\n");

        Subject subjectKor = new Subject(1001, "국어", 95);
        Subject subjectEng = new Subject(1002, "영어", 85);

        Student stLee = new Student( "이순신", subjectKor);
        Student stKim = new Student( "김유신", subjectEng);
        Student stHong = new Student( "홍길동", subjectEng);
        Student stKang = new Student( "강감찬", subjectEng);

        stLee.showInfo();
        stKim.showInfo();
        stHong.showInfo();
        stKang.showInfo();
    }
}
