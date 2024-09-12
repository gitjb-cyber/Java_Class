import java.util.Scanner;

public class Exam04_2 {
    public static void main(String[] args) {

        // 조건문
        // 성적 검사

        int score = 87;
        String grade = "";

        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        }else if (score >= 70) {
            grade = "C";
        }else if (score >= 60) {
            grade = "D";
        }else{
            grade = "F";
        }
        System.out.println(grade);




        // 1) 미세먼지 수치를 입력받아서 판정해주는 프로그램
        // 인터넷 기준
        Scanner sc = new Scanner(System.in);
        System.out.println("미세먼지 수치 : ");
        double Pm = sc.nextDouble();
        if(Pm >= 75){
            System.out.println("매우 나쁨");
        }else if(Pm >= 35){
            System.out.println("나쁨");
        }else if(Pm >= 15){
            System.out.println("보통");
        }else {
            System.out.println("좋음");
        }

        // 2) 키(M), 몸무게(kg) 입력 / bmi 수치 계산
        // 인터넷 기준

        System.out.println("키(m) : ");
        double height = sc.nextDouble();

        System.out.println("몸무게(kg) : ");
        double weight = sc.nextDouble();

        double bmi = weight / (height * height);
        if (bmi >= 30) {
            System.out.println("고도비만");
        }else if(bmi >= 25){
            System.out.println("비만");
        }else if(bmi >= 23){
            System.out.println("과체중");
        }else if(bmi >= 18.5){
            System.out.println("정상");
        }else {
            System.out.println("저체중");
        }


        // 3) 구매 금액을 입력받아, 10000원 이상 구매 고객의 경우
        // 구매 금액의 10% 적립, 그 외에는 5% 적립
        // 할인은 5% 할인, 그 외 3% 할인률 적용
        // 실제 구매 금액(할인된)과 적립 포인트 출력

        System.out.println("구매 금액 : ");
        int price = sc.nextInt();
        double point = 0;
        double sale = 0;
        if (price >= 10000){
            sale = 0.05;
            point = 0.1;
        } else {
            sale = 0.03;
            point = 0.05;
        }
        int total = (int)(price *(1-sale));
        int p = (int)(price *(point));

        System.out.printf("구매금액 : %d, 적립 포인트 : %d \n", price, point);

        // 4) 경복궁 입장료 계산 (중첩 if)
        // 내국인 or 외국인, 나이, 종로구민 여부 등 입력 받아서 계산
        System.out.println("내국인 or 외국인 >> y / n ");
        String nation = sc.next();

        if(nation.equals("y") || nation.equals("Y"))
        {
            System.out.println("종로구민? >> y/n");
            String jonglo = sc.next();
            if(jonglo.equals("y") || jonglo.equals("Y")){
                System.out.println("무료");
            }else {
                System.out.println(" 나이 >> ");
                int age = sc.nextInt();
                if (age >= 65) {
                    System.out.println("무료");

                } else if (age >= 19) {

                    System.out.println("3000원");
                }else {
                    System.out.println("50% 할인");
                }
            }

        }else {
            // 외국인
            System.out.println("나이: ");
            int age = sc.nextInt();

            if (age >= 65) {
                System.out.println("무료");

            } else if (age >= 19) {

                System.out.println("3000원");
            }else {
                System.out.println("50% 할인");
            }

        }



    }
}
