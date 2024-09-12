package Exam;
public class Test {

    public static void main(String[] args) {

        // 객체명 = 참조변수 (객체의 주소값을 담는 변수)
        // 클래스이름 객체명 = new 클래스이름();

        // Calculator 설계도 모양대로 calc 가 생산이 되었다(메모리에 할당)
        // calc 이름으로 클래스 안에 있는 변수 또는 메서드에 접근해서 사용 사능

        Calculator calc = new Calculator();

        int x = 20;
        int y = 10;

        double r4 = calc.division(x, y);
        int r5 = calc.rest(x, y);

        System.out.println(calc.add(x, y));
        System.out.println(calc.subtraction(x, y));
        System.out.println(calc.multiplication(x, y));
        System.out.println(r4);
        System.out.println(r5);

    }
}
