//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Test01 {
    public static void main(String[] args) {


        // 자바
        // 어떤 기능을 실행하는 간단한 메서드도
        // 반드시 클래스를 만들고 객체를 생성해서 실행해야 한다.
        // 그래서 코드가 많아짐


        // 익명클래스 - 이름은 없고, 한번만 사용가능
        Calculator calc = new Calculator(){
            @Override
            public int add(int x, int y){
                return x + y;
            }
        }; // <-- 여기서 마지막에 세미콜론 반드시 입력

        System.out.println(calc.add(10, 20));
        System.out.println(calc.add(20, 3));
    }
}