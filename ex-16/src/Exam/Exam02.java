package Exam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("점수 입력 : ");
            int score = sc.nextInt();

            if (score >= 65) {
                System.out.println("합격");
            }else {
                System.out.println("불합격");
            }
        }catch (InputMismatchException e){
            System.out.println("키보드 입력 오류");
        }
    }
}
