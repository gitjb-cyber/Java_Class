public class Exam02 {
    public static void main(String[] args) {
        /*
        while
        - 언제 반복이 끝날지 모름, 특정 조건이 들어오면 종료

        for
        - 반복 횟수를 알 수 있는 경우
        - 횟수가 정해진 경우, 알 수 있는 경우, 한계가 있는 경우
         */

        int i = 0; // 카운트 역할

        System.out.println("while 문");
        while (i < 3) {
            System.out.println(i++);
        }
        i = 3;
        while (i > 0) {
            System.out.println(i--);
        }

        // 횟수가 정해진 경우 for 문으로 쓰는게 유리함
        // 증가
        System.out.println("for 문");
        for(i = 0; i < 3; i++){
            System.out.println(i);
        }
        for(i = 3; i > 0; i--){
            System.out.println(i);
        }

    }
}
