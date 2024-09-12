import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        // 문제 1
        // 월을 입력 받아서
        // 1) 계절 출력
        // 2) 해당 월의 마지막 날짜를 출력

        Scanner sc = new Scanner(System.in);
        System.out.println("년도 입력 : ");
        int year = sc.nextInt();
        System.out.println("월 입력 : ");
        int month = sc.nextInt();



        switch (month) {
            case 3, 4, 5 -> System.out.println("봄");
            case 6, 7, 8 -> System.out.println("여름");
            case 9, 10, 11 -> System.out.println("가을");
            case 12, 1, 2 -> System.out.println("겨울");
            default -> System.out.println("오류");
        }
        int lastDay = switch (month){
            case 1, 3, 5, 7, 8, 10, 12 -> 31;

            case 2 -> {
                // 윤년 검사
                boolean isLeapYear = (year % 4 == 0) && year % 100 != 0 || year % 400 == 0;
                yield 28 + (isLeapYear ? 1 : 0);
            }

            case 4, 6, 9, 11 -> 30;
            default -> 0;
        };
        System.out.printf("말일 %d일", lastDay);
    }
}
