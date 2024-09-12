import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        // 문제 1
        // 월을 입력 받아서
        // 1) 계절 출력
        // 2) 해당 월의 마지막 날짜를 출력

        Scanner sc = new Scanner(System.in);
        System.out.println("년도 입력");
        int year = sc.nextInt();
        System.out.println("월 입력: ");
        int month = sc.nextInt();

        // 윤년 검사
        boolean isLeapYear = (year % 4 == 0) && year % 100 != 0 || year % 400 == 0;

        switch (month) {
            case 3: case 4: case 5:
                System.out.println("봄");
                break;
            case 6: case 7: case 8:
                System.out.println("여름");
                break;
            case 9: case 10: case 11:
                System.out.println("가을");
                break;
            case 12: case 1: case 2:
                System.out.println("겨울");
                break;
            default:
                System.out.println("오류");
        }
        switch (month){
            case 1 : case 3 : case 5: case 7: case 8: case 10: case 12:
                System.out.println("말일 : 31일");
                break;
            case 2:
                System.out.printf("말일 : %d일\n", 28 + (isLeapYear ? 1 : 0));
                break;
            case 4:  case 6: case 9:  case 11:
                System.out.println("말일 : 30일" );
                break;
            default:
                System.out.println("오류");
        }
    }
}
