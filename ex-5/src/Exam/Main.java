//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package Exam;
public class Main {
    public static void main(String[] args) {

        /*
             하나의 반복되는, 자주 사용하는 코드를 묶어 놓은 것
             정의를 하고 호출해서 사용

             함수, 메서드
             함수 - 단독 사용 가능한 기능

             메서드 - 어떤 객체가 있어야 실행할 수 있는 기능
                     클래스 안에서 만들어진 함수
        */
        /*
            함수구조

                                매개변수 - Parameter - Param
            반환값자료형 함수이름 (자료형변수, 자료형변수){
                실행코드 작성

                return 값; // return 값 = 반환값
            }

            함수호출(값, 값); --> 인자, 인수 - Arguments - args

            # 객체 : 클래스의 형태대로 메모리 공간에 할당된 하나의 대상, 요소

            객체명.메서드명();
            객체명.메서드명(값);
            객체명.메서드명(값, 값);

         */

        // 클래스의 객체 생성하여, 메서드를 실행하는 코드
        Main test = new Main(); // Main 클래스 형태로 객체를 생성

        test.welcome();
        welcome(); // 함수 호출
        int result = add(3, 4);
        System.out.println(result);
    }

    // 함수 정의
    // void : 자료형이 없다, 미정 (return 값 없음)
    public static void welcome(){
        System.out.println("프로그램 시작");
    }
    //
    public static int add(int a, int b){
        return a + b;
    }
}