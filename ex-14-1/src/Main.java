//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // 내부 클래스
        /*
            - 클래스 내부에 선언한 클래스로 이 클래스를 감싸고 있는
              외부 클래스와 밀접한 연관이 있는 경우가 많고,
              다른 외부 클래스에서 사용할 일이 거의 없는 경우에
              내부 클래스로 선언해서 사용함
            - 중첩 클래스 라고도 함
            - 내부 클래스의 종류
                인스턴스 내부 클래스
                정적(static) 내부 클래스
                지역(local) 내부 클래스
                익명(anonymous) 내부 클래스

                ex)
                자동차 - 객체 (외부클래스)
                엔진 - 객체 (내부클래스)

        */
        // 방법1
        OutClass out = new OutClass(); // 외부, 내부 클래스 동시 생성
        System.out.println("외부 클래스 이용하여 내부 클래스 기능을 호출");
        out.usingClass();
        System.out.println();


        // 방법 2
        // 외부클래스명.내부클래스명 변수명 = 부모객체.new 내부클래스명();
        OutClass.InClass inClass = out.new InClass();
        System.out.println("외부클래스 변수를 이용하여 내부 클래스 생성");
        inClass.inTest();
    }
}