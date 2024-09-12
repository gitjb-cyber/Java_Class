package Exam;

import java.util.Arrays;

public class Exam01 {
    public static void main(String[] args) {
        int result = 0;
        try{
            // 실행할 문장
            result = 10 / 0;  // 예외 발생 -> 해당하는 catch 문으로 이동
            System.out.println("나누기 결과 : " + result);

        }catch (ArithmeticException e){
            // 예외 처리문장 = Exception 발생시 실행할 문장
            System.out.println("0으로 나누기 할 수 없음");
        }
        System.out.println("종료");
    }
}
