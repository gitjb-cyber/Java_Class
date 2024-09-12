public class Exam02_4 {
    public static void main(String[] args) {

        // 중첩 반복문
        // for 문 구구단
        /*
        for (int i = 2; i < 10; i++){
            for ( int j = 1; j < 10; j++){
                System.out.printf(" %d * %d = %d\n", i, j, i * j);
            }
            System.out.println("-------------------");
        }

         */
        // 문제 for 문 짝수단만 출력

        for (int i = 2; i < 10; i++){
            if(i % 2 == 1){
                continue;
            }
            for ( int j = 1; j <= i; j++){
                System.out.printf(" %d * %d = %d\n", i, j, i * j);
            }
            System.out.println("-------------------");

        }

    }
}
