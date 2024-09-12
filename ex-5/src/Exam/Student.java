
package Exam;
// 접근 제한자
/*
    외부 클래스에서 접근이 가능한지 여부
    public : 모든 곳에서 접근 가능
    protected : 상속 가능, 같은 패키지 가능
    default : 상속 가능, 패키지 다르면 접근 불가
    private : 외부에서 접근 불가능 (내부 가능) - 정보은닉


                    내부      |       상속      |       패키지      |       외부
    public :         O                 O                 O                 O
    protected :      O                 O                 O                 X
    default :        O                 O                 X                 X
    private :        O                 X                 X                 X


 */
public class Student {

    // 학생 클래스
    // 정보 - 학번, 이름, 주소
    // 기능 - 학생의 정보를 모두 출력

    // 멤버 변수 = 인스턴스 변수 = 필드 = 정보, 속성
    private int studentId;
    private String studentName;
    private String address;

    // 외부에서 접근 가능한 public 메서드를 만들어서 사용한다.
    // 값에 접근 - get 메서드
    // 값에 저장 - set 메서드
    public int getStudentId(){
        return studentId;
    }

    public int setStudentId(int studentId){
        this.studentId = studentId;
    }

    public String getstudentName(){
        return studentName;
    }

    public String setstudentName(String studentName){
        this.studentName = studentName;
    }

    public String getaddress(){
        return address;
    }

    public String setaddress(String address){
        this.address = address;
    }


    // 기본생성자 - 항상 기본으로 적어둠. (초기화)
    public Student (){}

    // 생성자 오버로딩
    public Student (int studentId, String studentName, String address){
       // 현재 호출한 영역에서 가장 가까운 값에 접근
       // this : 현재 나의 객체 주소값   ex) 현재 객체 stLee 라면 this -> stLee 의 주소값
       // this.변수명 = 현재 나의 객체의 인스턴스 변수에 접근

        this.studentId = studentId;
        this.studentName = studentName;
        this. address = address;
    }

    public void showStudentInfo (){
        System.out.println(studentId + " / " + studentName + " / " + address);
    }

    // 오버로딩 : 메서드의 이름은 같고, 매개변수의 자료형, 갯수 등을 변경해서 정의
    // 오버라이딩 : 상속 관계에서 자식 클래스가 메서드의 기능을 재정의

    // toString 메서드 기능 재정의
    // 원래 - 클래스@해시코드16진수
    // 변경 - 인스턴스 변수의 정보들을 출력하는 형태로 변경한다.

    // toString 이용해서 객체의 정보 출력
    @Override
    public String toString(){
        return studentId + " / " + studentName + " / " + address;
    }

}
