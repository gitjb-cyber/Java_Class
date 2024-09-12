package Exam03;

public class JapanTour implements Tour {

    @Override
    public void header(){
        System.out.println("----------------");
        System.out.println("\t 일본 여행");
        System.out.println("----------------");
    }


    @Override
    public void program(){
        System.out.println("---여행지---");
        System.out.println("- 오사카");
        System.out.println("- 도쿄");
        System.out.println("- 오키나와");
    }

    @Override
    public void meal(){
        System.out.println("---식사---");
        System.out.println("- 초밥");
        System.out.println("- 우동");
        System.out.println("- 라멘");
    }

    @Override
    public void hotel(){
        System.out.println("---숙박---");
        System.out.println("- 도쿄호텔");
    }

}
