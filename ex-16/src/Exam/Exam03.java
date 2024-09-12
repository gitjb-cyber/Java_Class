package Exam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ArrayIndexOutOfBoundsException
        // InputMismatchException

        try{
            int [] cards = {4, 5, 1, 2, 7, 8};

            System.out.println("몇 번째 카드를 뽑으시겠습니까?");
            int cardIndex = sc.nextInt();
            System.out.println("뽑은 카드 번호 : " + cards[cardIndex]);
        }catch (InputMismatchException e){
            System.out.println("숫자만 입력 가능");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("0 ~ 5 사이만 입력");
        }catch (Exception e){ // 다중 catch 가장 마지막에 와야함.
            // 다른 Exception 의 상위 클래스이기 때문
            // 먼저 쓰면 모두 다 기본 Exception 으로 처리
            System.out.println("예외 발생!!");
        }finally {
            // 모든 코드를 실행한 뒤, 예외 발생 여부 상관없이 무조건적으로 실행되는 코드
            // 반드시 처리해야 하는 구문
            System.out.println("종료");
        }

        sc.close(); // 입력 종료
    }
}
