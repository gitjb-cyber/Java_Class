import java.util.Scanner;

public class Exam02_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) { // 무한 반복
            System.out.println("0~100 숫자 입력(999 종료) : ");
            int n = sc.nextInt();

            // 종료 조건
            if (n == 999) {
                System.out.println("종료");
                break; // 반복문 종료
            }

            // 재입력 조건
            if (n < 0 || n > 100) {
                System.out.println("ㄴ다시 입력");
                continue; // 반복문의 처음으로 돌아감
            }

        }


    }
}
