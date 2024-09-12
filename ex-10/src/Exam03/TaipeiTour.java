package Exam03;

public class TaipeiTour implements Tour {

    @Override
    public void header(){
        System.out.println("----------------");
        System.out.println("\t 대만 여행");
        System.out.println("----------------");
    }


    @Override
    public void program(){
        System.out.println("---여행지---");
        System.out.println("- 예류");
        System.out.println("- 진과스");
        System.out.println("- 지우펀");

        System.out.println("- 스펀");
    }

    @Override
    public void meal(){
        System.out.println("---식사---");
        System.out.println("- 우육면");
        System.out.println("- 샤오롱바오");
        System.out.println("- 펑리수");
    }

    @Override
    public void hotel(){
        System.out.println("---숙박---");
        System.out.println("- 타이페이 호텔");
    }

}
