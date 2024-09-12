import java.util.Scanner;

public class Exam02_2 {
    public static void main(String[] args) {

        // 비교연산자 - 조건이 2개 이상일때
        /*
        ## and 조건 (이고, 둘 다, 모두, 전부)
        (조건이 모두 맞아야 true)
        - 영어점수가 70점 이상, 국어 점수가 70점 이상이면
        = 둘다 70점 이상

        국어>=70 && 영어>=70

        ## or 조건 (또는, ~~중 하나)
        (조건이 하나라도 맞으면 true)
        - 국어 또는 영어 점수가 90점 이상이면

        국어>=70 || 영어>=70


        ex)
        숫자 구간 - and 조건
        0 ~ 100 사이 값
        = 0이상 100이하
        num >= 0 && num <= 100

        0 ~ 100 사이 값이 아니라면
        = 0미만, 100초과 둘 중에 하나라도 해당
        num < 0 || num > 100


         */

        // 놀이공원 놀이기구 이용 조건 - 나이가 12세 이상, 키 120 이상

        Scanner sc = new Scanner(System.in);
        System.out.println("나이입력 : ");
        int age = sc.nextInt();

        System.out.println("키 입력 : ");
        double height = sc.nextDouble();

        if (age >= 12 && height >= 120)
            System.out.println("탑승가능");

        // 승진 조건 - 면담 60점 이상, 영업이익 또는 매출 총 이익이 100이상 인 경우
        // interview >= 60 and operating >= 100 or sales >= 100

        // 윤년 계산 - 연도가 4로 나누어 떨어지고 연도가 100으로 나누어 떨어지지 않거나, 연도가 400으로 나누어 떨어진다.
        // year % 4 == 0 && year % 100 != 0 || year % 400 == 0

        // 할인혜택 - 도서관에 입장시 회원증을 지참, 마스크 착용
        // 적절한 자료형을 선택하여 변수를 선언하고 작명하시오.

        // is~ - 상태, has~ - 보유여부
        // boolean hasMembership = true
        // boolean wearingMask = true
        // System.out.println(hasMembership = true && wearingMask = true);


        // not 연산자
        // true -> false, false -> true

        boolean isOn = false;

        isOn = !isOn; // 상태 반전해서 저장
        System.out.println(isOn); // off -> on
        isOn = !isOn; // 상태 반전해서 저장
        System.out.println(isOn); // on -> off



        // 반복문
        for(int i =0; i<3; i++)
        {
            isOn = !isOn; // 상태 반전해서 저장
            System.out.println(isOn); // off -> on
        }




    }
}
