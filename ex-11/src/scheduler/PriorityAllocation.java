package scheduler;

public class PriorityAllocation implements Scheduler{

    // 기본 접근 제한자가 default
    @Override
    public void getNextCall(){
        System.out.println("고객 등급에 따라 상담원 배정");
    }

    @Override
    public void sendCallToAgent(){
        System.out.println("다음 순서의 상담원에게 배분합니다. ");
    }
}
