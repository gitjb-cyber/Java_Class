import java.util.Scanner;

public class Exam01_3 {
    public static void main(String[] args) {
        String isOk = "yes";
        char ch = isOk.charAt(0);
        System.out.println(isOk.charAt(0));
        System.out.println(isOk.charAt(1));
        System.out.println(isOk.charAt(2));

        switch (ch){
            case 'y', 'Y' -> System.out.println("ok");
            case 'n', 'N' -> System.out.println("no");
            default -> System.out.println("다시 입력");
        };

        // 사칙연산 계산기
        // 숫자 2개를 입력받고,
        // +, -, *, / 연산자 입력 받고
        // 해당 계산을 수행 - switch

        Scanner sc = new Scanner(System.in);

        System.out.printf("첫 번째 숫자를 입력하세요 : ");
        double num1 = sc.nextDouble();
        System.out.printf("두 번째 숫자를 입력하세요 : ");
        double num2 = sc.nextDouble();

        System.out.printf("연산자를 입력하세요(+, -, *, /) : ");
        char operator = sc.next().charAt(0); // 문자열 1개 입력받기

        final int ERROR_CODE = -9999;

        double result =  switch (operator) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> {
                if (num1 == 0 || num2 == 0){
                    System.out.println("0으로 나눌 수 없습니다.");
                    yield ERROR_CODE;
                }else {
                    yield num1 / num2;
                }
            }
            default -> ERROR_CODE;
        };

        if (result == ERROR_CODE) {
            System.out.println("계산 오류");
        }else {
            System.out.printf("결과 : %.2f", result);
        }
    }
}
