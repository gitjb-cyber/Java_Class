import java.util.Scanner;

public class Exam02_2 {
    public static void main(String[] args) {
                /*
        while
        - 언제 반복이 끝날지 모름, 특정 조건이 들어오면 종료

        for
        - 반복 횟수를 알 수 있는 경우
        - 횟수가 정해진 경우, 알 수 있는 경우, 한계가 있는 경우
         */

        Scanner sc = new Scanner(System.in);


        System.out.println("0이 들어오기 전까지 반복");
        int n = 1;
        System.out.println("while 문 구현");
        while (n != 0){
            System.out.println("숫자 입력 : 0이 들어오기 전까지 반복");
            n = sc.nextInt();
            System.out.println(n);
        }

        System.out.println("while 종료");

        System.out.println("for 문 구현");
        // for(초기조건; 종료조건; 증감조건)
        for( ; n != 0; ){
            System.out.println("숫자 입력 : 0이 들어오기 전까지 반복");
            n = sc.nextInt();
            System.out.println(n);
        }
        System.out.println("for 종료");
    }
}
