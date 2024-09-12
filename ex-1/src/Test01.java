import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        // 1. 숫자 2개를 입력 받아서, 사칙연산 결과를 출력하시오.
        // ex) 덧셈, 뺄셈, 몫, 나머지, 소수점까지 나눈 값

        // 2. 라면 개수를 입력 받아서, 박스 갯수와 남은 갯수를 출력
        // ex) 1box 20개, 48 -> 2박스 8개 남음 출력

        // 3. 학생의 정보를 입력받은 후 출력
        // 이름 학번 학년 점수평균

        // (1)
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.println("더하기 : " + (n1+n2));
        System.out.println("빼기 : " + (n1-n2));
        System.out.println("곱 : " + (n1*n2));
        System.out.println("몫 : " + (n1/n2));
        System.out.println("나머지 : " + (n1%n2));
        System.out.println("소수점 나누기 : " + ((double)n1/n2));

        // print : 줄바꿈X
        // println : 줄바꿈O
        // printf : 서식 문자를 통해 변수깂을 출력, 줄바꿈X

        // 서식문자 : %d -> 정수 , %f -> 실수
        // %.2f : 실수형 - 소수점 둘째자리 까지

        System.out.printf("덧셈 : %d \n", n1+n2);
        System.out.printf("뺄셈 : %d \n", n1-n2);
        System.out.printf("곱셈 : %d \n", n1*n2);
        System.out.printf("나눗셈 : %d \n", n1/n2);
        System.out.printf("나머지 : %d \n", n1%n2);
        System.out.printf("소수점 나누기 : %.2f \n", (double)n1/n2);

        // (2)
        Scanner sc1 = new Scanner(System.in);

        System.out.println("라면 갯수 (1box = 20개) : ");
        int n3 = sc.nextInt();

        System.out.println(n3 + " --> " + (n3/20) + "박스 + " + (n3%20) + "개");
        System.out.printf("%d box / %d개 남음 \n", (n3/20), (n3%20));

        // (3)
        System.out.println("이름 : ");
        String n4 = sc.next();
        System.out.println("학번 : ");
        int n5 = sc.nextInt();
        System.out.println("학년 : ");
        int n6 = sc.nextInt();
        System.out.println("점수 평균 : ");
        double n7 = sc.nextDouble();

        System.out.println(" 이름 : "+n4+" / 학번 : "+n5+" / 학년 : "+n6+" / 점수 평균 : " +n7);
        System.out.printf(" 이름 : %s, 학번 : %d, 학년 : %d, 평균 : %.1f", n4, n5, n6, n7);

        // 교재 ~74p
    }
}
