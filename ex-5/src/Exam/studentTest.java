package Exam;
public class studentTest {
    public static void main(String[] args) {

        // 객체가 각각 생성되고,
        // 객체별로 각각 다른 값을 저장할 수 있다.
        /*
        클래스는?
         - 객체의 속성을 정의 하고,
         - 기능을 구현하여 만들어 놓은 코드 상태

         실제 클래스 기반으로 생성된 객체(인스턴스)는
         각각 다른 맴버 변수 값을 가지게 됨
         가령, 학생의 클래스에서 생성된 각각의 인스턴스는
         각각 다른 이름, 학번, 학년 등의 값을 가지게 됨

         * 메모리 할당
          - 코드 : 코드가 올라가는 영역, 코드에 주소값이 할당
          - 데이터 : 프로그램 시작부터 종료시까지 유지되는 값, static 키워드 사용
          - 스택 : { } 중괄호 내에서만 존재하고, 중괄호 끝나면 메모리에서 사라진다.
                   { } 중괄호 안에 존재하는 지역변수, 매개변수 등이 올라간다.
                    * 기본자료형 - int, double, char
                    - int 일반변수명; ---> 직접 값을 가지고 있음
                    - int [] 배열명; ---> 배열의 주소값
                    - String 참조변수명 = ""; ---> 리터럴 상수의 주소값
                    - 클래스 객체명; ---> 객체의 주소값
                    - 함수/메서드의 매개변수, {} 안에서 선언된 result

                    public int add( int x, int y){
                        int result = x + y;
                        return result;
                    }
          - 힙 (동적메모리) : 객체(인스턴스)가 존재
                            new 키워드를 사용하여 인스턴스 생성
                            해제 - 자바에서 Garbage Collector 가 주기적으로 사용하지 않는 메모리
                                   (C, C++ 프로그래머다 직접 해제, free() delete 이용)

         */

        /*
            용어정리
            - 클래스 : 설계도, 객체를 프로그래밍 하기 위해 코드로 정의해놓은 상태
            - 객체 : 대상, 객체지향 프로그램의 대상, 생성된 인스턴스
            - 인스턴스 : new 키워드를 사용하여 클래스를 메모리에 생성한 상태

            - 멤버 변수 : 클래스 안에 정의된 변수 / 속성, 특성, 상태 저장
            - 메서드 : 클래스 안에 정의된 함수 / 기능 담당

            - 참조 변수 : 객체명, 메모리에 생성된 인스턴스를 가리키는 변수
            - 참조 값 : 주소값, 생성된 인스턴스의 메모리 주소 값
         */

        Student stLee = new Student(100, "이순신", "서울");
        stLee.showStudentInfo();

        // 클래스의 최상위 클래스 : Object 클래스
        // 모든 클래스는 Object 클래스를 기본적으로 상속받는다.
        // Object 클래스 안에 있는 기능들을 사용할 수 있다.

        // toString() - 클래스명@해시코드
        // 해시코드 - 객체의 고유한 값(주소값)


        System.out.println(stLee.toString()); // 16진수
        System.out.println(stLee.hashCode()); // 10진수

        Student stKim = new Student(); // 생성자 호출구문
        stKim.setStudentId(200);
        stKim.setstudentName("김유신");
        stKim.setaddress("경주");

        stKim.showStudentInfo();
    }
}
