package scheduler;

public class LeastJob implements Scheduler{

    // 기본 접근 제한자가 default
    @Override
    public void getNextCall(){
        System.out.println("쉬고있거나 할당된 전화수가 적은 상담원에게 배정");
    }

    @Override
    public void sendCallToAgent(){
        System.out.println("다음 순서의 상담원에게 배분합니다. ");
    }
}
