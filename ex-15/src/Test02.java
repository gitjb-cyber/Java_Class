public class Test02 {
    public static void main(String[] args) {
        String str = "정적 내부 클래스 테스트";

        // static 이기 때문에
        // 외부클래스의 객체를 생성하지 않아도 됨.
        // 외부클래스명으로 바로 객체 생성 가능

        // 외부클래스.내부클래스 객체명 = new 외부클래스.내부클래스();
        PrintOut.Out out = new PrintOut.Out();
        out.println(str);
    }
}
