package Exam;

import javax.script.ScriptContext;
import java.util.Scanner;

public class Exam05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("당신의 나이 입력 >> ");
            int age = sc.nextInt();

            if (age < 0 || age > 100) {
                // 사용자 정의 예외 발생 시켜줌
                throw new InputErrorException("0 ~ 100 사이 값 입력"); // InputErrorException 에 message 를 넣어줌
            }
            if (age > 19) {
                System.out.println("성인");
            } else if (age > 13) {
                System.out.println("청소년");
            } else if (age > 6) {
                System.out.println("어린이");
            } else {
                System.out.println("아동");
            }
        } catch (InputErrorException e) {
            System.out.println(e.getMessage());
        }
    }
}
