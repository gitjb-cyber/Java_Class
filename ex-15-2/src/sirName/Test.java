package sirName;


public class Test {
    public static void main(String[] args) {
        // 자료형 = 인터페이스형

        SirName test = new SirName() {
            @Override
            public String sirName(String name) {
                return name + "님";
            }
        };

        // 람다식(lambda)
        // 실행 문장이 1줄이고, return 문만 있는 경우, return 과 중괄호 생략 가능
        // 매개변수가 1개인 경우 () 괄호 생량 가능
        SirName test02 = name -> name + "님";

        System.out.println(test.sirName("홍길동"));
        System.out.println(test02.sirName("강감찬"));

    }
}
