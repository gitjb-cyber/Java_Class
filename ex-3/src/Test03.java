import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        // 상수에 END_DODE 999 를 저장하고
        // END_DODE 숫자가 들어오면 종료

        // 숫자를 종료코드 들어오기 전까지 입력 받은 다음에
        // 종료 후, 합계가 출력
        // (종료 코드는 합산 X)
        // while, if , break, continue 적절히 사용

        final int END_DODE = 999;
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int total = 0;
        while (true) {
            System.out.println("숫자 입력 : ");
            int num1 = sc.nextInt();
            if (num1 == END_DODE) {
                break;
            }
            total += num1;
            count++;
        }

        double avg = (double) total / count;
        System.out.println("합계 : " + total + ", 평균 : "+ avg);
    }
}
