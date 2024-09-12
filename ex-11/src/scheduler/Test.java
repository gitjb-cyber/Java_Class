package scheduler;

/*
    고객 센터에 전화상담을 하는 상담원들이 있습니다.
    일단 고객에게서 전화가 오면 대기열에 저장되고
    각 상담원에게 배분이 됩니다.

    배분이 되는 정책 3가지
    - R (RoundRobin) : 상담원 순서대로 배분합니다.
    - L (LeastJob) : 쉬고 있거나 상담원에게 할당된 통화수가 가장 적은 상담원에게 배분
    - P (PriorityAllocation) : 고객의 등급에 따라 등급이 높은 고객은 업무능력이
                                우수한 상담원에게 배분

    세가지 정책은 필요에 따라 바뀌어 운영될 수 있습니다.

    - 인터페이스 이름 : Scheduler
    - getNextCall()
        ㄴ R : 메시지 : 상담 전화를 순서대로 배정
        ㄴ L : 메시지 : 쉬고있거나 할당된 전화수가 적은 상담원에게 배정
        ㄴ P : 메시지 : 고객 등급에 따라 상담원 배정
    - sendCallToAgent()
        ㄴ 메시지 : 다음 순서의 상담원에게 배분합니다.


 */

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("전화 상담원 할당 방식을 선택하세요");
        System.out.println("R : 한명씩 차례대로 ");
        System.out.println("L : 대기가 적은 상담원 우선 ");
        System.out.println("P : 우선순위가 높은 고객우선 숙련도 높은 ");
        String choice = sc.next();


        Scheduler scheduler = null;

        switch (choice){
            case "R", "r" -> scheduler = new RoundRobin();
            case "L", "l" -> scheduler = new LeastJob();
            case "P", "p" -> scheduler = new PriorityAllocation();
            default -> {
                System.out.println("지원되지 않는 기능");
                return;
            }
        }
        scheduler.getNextCall();
        scheduler.sendCallToAgent();
    }
}
