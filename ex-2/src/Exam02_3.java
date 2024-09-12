import java.util.Scanner;

public class Exam02_3 {
    public static void main(String[] args) {
        // 삼항연산자
        // case 1 : (조건) ? 참 : 거짓;
        // case 2 : 변수 = (조건) ? 참 : 거짓;

        /*
        boolean genderState = true;
        String gender = (genderState == true) ? "남자" : "여자";
        System.out.println(gender);
        // 1이면 남자, 2면 여자

        Scanner sc = new Scanner(System.in);
        System.out.println("성별 : ");
        int genderCode = sc.nextInt();
        System.out.println((genderCode == 1) ? "남" : "여");

        // 남 입력받으면 1, 여 입력 2 출력
        // 입력받는 내용이 문자열
        // 문자열이 같은지 비교
        System.out.println("남 여 입력 : ");
        String genderStr = sc.next();

        int genderCode2 = genderStr.equals("남") ? 1 : 2;
        System.out.println(genderCode2);


         */
        // 삼항연산자, 비교연산자, 스캐너 이용한 문제

        // 1) 올해 연도 입력 받고 윤년인지 아닌지 출력(평년, 윤년)
        Scanner sc = new Scanner(System.in);
        System.out.println("올해 연도를 입력하시오 : " );
        int year = sc.nextInt();

        boolean isLeafYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        // (year % 4 == 0 && (year % 100 != 0) || year % 400 == 0); 중간에 괄호 상관X
        System.out.println(isLeafYear ? "평년" : "윤년");

        // 2) 두 사람의 나이를 입력받도, 나이가 더 많은 사람의 나이 출력
        // ex) 첫번째 사람의 나이가 더 많습니다.

        System.out.print("나이 1 : ");
        int age1 = sc.nextInt();
        System.out.print("나이 2 : ");
        int age2 = sc.nextInt();

        System.out.println((age1 > age2 ? "첫번째" : "두번째") + " 사람의 나이가 더 많습니다.");

        // 3) 점수가 0~100 값으로 입력받으시오
        // 잘못입력 - 다시 입력 / 정상 - 정상 출력

        System.out.println("점수 입력 : ");
        int score = sc.nextInt();
        System.out.println( score < 0 || score >100 ? "다시 입력" : "정상 입력");

        // 교재 ~99p


    }
}
