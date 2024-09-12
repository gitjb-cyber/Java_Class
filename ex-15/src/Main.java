//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // 내부 클래스 선언하는 방법
        /*

        1) 외부 클래스의 객체를 먼저 만든다.

         외부클래스 외부객체명 = new 외부클래스();
          ex) Calculator cal = new Calculator(10, 11);

        2) 외부클래스 객체명을 이용하여 내부 클래스 객체를 선언
        - 반드시 외부 클래스 객체가 있어야만 선언이 가능하다.

        외부클래스.내부클래스 내부객체명 =  외부객체명.new 내부클래스명();
         ex) Calculator.Calc c = cal.new Calc();


         */

        Calculator cal = new Calculator(10, 11);

        // 내부 클래스를 선언해서 사용하는 방법
        Calculator.Calc c = cal.new Calc();
        System.out.println("합 : " + c.add() );

        //외부 클래스의 메서드를 이용해서 내부 클래스의 메서드 실행
        System.out.println("합 : " + cal.plus());
    }
}