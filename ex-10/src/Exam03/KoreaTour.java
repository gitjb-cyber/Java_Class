package Exam03;

public class KoreaTour implements Tour {

    @Override
    public void header(){
        System.out.println("----------------");
        System.out.println("\t 한국 여행");
        System.out.println("----------------");
    }

    @Override
    public void program(){
        System.out.println("---여행지---");
        System.out.println("- 경복궁");
        System.out.println("- 북촌 한옥마을");
        System.out.println("- 인사동");
    }

    @Override
    public void meal(){
        System.out.println("---식사---");
        System.out.println("- 비빔밥");
        System.out.println("- 불고기");
        System.out.println("- 불닭");
    }

    @Override
    public void hotel(){
        System.out.println("---숙박---");
        System.out.println("- 신라호텔");
    }

}
