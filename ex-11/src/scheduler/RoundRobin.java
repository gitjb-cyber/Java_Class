package scheduler;

public class RoundRobin implements Scheduler{

    // 기본 접근 제한자가 default
    @Override
    public void getNextCall(){
        System.out.println("상담 전화를 순서대로 배정");
    }

    @Override
    public void sendCallToAgent(){
        System.out.println("다음 순서의 상담원에게 배분합니다. ");
    }
}
