public class Exam02 {
    public static void main(String[] args) {
        // 연산자
        /*

        1) 사칙연산
        + : 숫자 - 덧셈, 문자열 - 이어붙이기
        -
        *
        / : 정수 - 몫만 ( 소수점 ex : (double)10/3 = 3.3333
                                    (자료형) - 형변환, 캐스트 연산자
        % : 나머지 구하기


        2) 복합대입 연산자
        num = num + 10; => num += 10;
        num -= 3;
        num *= 3;
        num /= 3;
        num %= 3;


        3) 비교연산자
        (결과값은 항상 ture / false)
        > : 초과
        < : 미만
        <= : 이상
        >= : 이하
        == : 같다
        != : 다르다


        4) 증감 연산자
        1씩 더하거나 1씩 빼는것
        i++;    i--;    --> 후위 연산자 : 연산 우선순위가 가장 마지막
        ++i;    --i;    --> 전위 연산자 : 연산 우선순위가 가장 처음

         */

        int n1 = 10;
        int n2 = 3;

        System.out.println( n1 += 3 );
        System.out.println( n1 -= 3 );
        System.out.println( n1 *= 3 );
        System.out.println( n1 /= 3 );
        System.out.println( n1 %= 3 );

        System.out.println( n1 > n2 );
        System.out.println( n1 < n2 );
        System.out.println( n1 >= n2 );
        System.out.println( n1 <= n2 );
        System.out.println( n1 == n2 );
        System.out.println( n1 != n2 );

        int result = 3;
        int i = 0;
        int a = 10;

        System.out.println("i = " + i);
        System.out.println( result * i++ );
        System.out.println("i = " + i);
        System.out.println( result * ++i );
        System.out.println("i = " + i);
        // 교재 ~ 96p
    }
}
