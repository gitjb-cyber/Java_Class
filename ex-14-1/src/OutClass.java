public class OutClass {
    private int num = 10;
    private static int sNum = 20;

    private InClass inClass;

    public OutClass(){
        inClass = new InClass();
    }

    // 내부 클래스의 기능을 호출하는 메서드 별고로 만듦
    public void usingClass(){
        inClass.inTest();   // 내부 클래스 변수를 사용하여 메서드 호출하기
    }

    class InClass{

        // 내부 클래스 - 외부 클래스의 변수를 그대로 이용할 수 있음
        int inNum = 100;

        void inTest(){
            System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
            System.out.println("InClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수)");
        }


    }
}
