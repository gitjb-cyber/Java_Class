import java.util.Scanner;

public class Exam04 {
    public static void main(String[] args) {
        // 데이터 입력 받기
        // 키보드를 이용해서 입력

        // 키보드로 부터 데이터를 입력받는 객체 sc 선언
        // Scanner 형태
        Scanner sc = new Scanner(System.in);

        System.out.println("이름입력 : ");
        String name = sc.next(); // 문자열 변환

        System.out.println("나이입력 : ");
        int age = sc.nextInt(); // 숫자 변환

        System.out.println("키 입력 : ");
        double height = sc.nextDouble(); // 실수 변환

        System.out.println("<" + name + "님의 정보>");
        System.out.println("나이 : " + age + " / 키 : "+height);



    }
}
