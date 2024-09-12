public class Exam02 { // 앞은 대문자
    public static void main(String[] args) { // 단축키 main
        // 자료형 변환
        /*
        1) 자동현 변환 = 묵시적 형변환
         - 정수 -> 실수
         - 자료형 크기가 작은 것 -> 큰ㅅ것
         - 객체형 변환 : 자식 type -> 부모 type

         2) 강제형 변환 = 명시적 형변환
          - 실수 -> 정수
          - 큰 자료형 -> 작은 자료형
          - 객체형 변환 : 부모 type -> 자식 type

          *형변황 왜?
           - 자료형마다 저장하는 방법 다름
           - 자료형을 한쪽으로 맞춤
        */

        //자동형변환
        int n1 = 2;
        double n2 = 3.14;

        // int resutl = n1+n2; 에러
        double resutl = n1 + n2;

        short n3 = 10000; // 2byte 정수형

        int n4 = n3;

        System.out.println(resutl);
        System.out.println(n3);
        System.out.println(n4);

        //강제형변환
        //(자료형) : 캐스트 연산자, 해당 자료형으로 변환
        int n5 = (int) (n1 + n2);
        System.out.println(n5);
        // 정수로 변환했기 때문에 소수부 사라짐 = 데이터 손실 발생

        n4 = 10000343;
        n3 = (short) n4;
        System.out.println(n3);
        // n4가 short 에서 담을 수 있는 값 초과

        int x = 10;
        int y = 3;

        // 정수의 나눗셈은 몫만 계산
        // 소수점까지 -> 한쪽을 double 강제형변환
        System.out.println((double) x / y);

        //(double)x -> 강제 형변환
        // y -> x 때문에 자동 형변환
        // double / double = doubled의 결과

    }

}
