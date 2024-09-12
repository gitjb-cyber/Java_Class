package Exam02;

public class Person {

    public Phone phone;

    public Person(Phone phone)
    {
        this.phone = phone;
    }

    public void buyNewPhone(Phone phone)
    {
        this.phone = phone;
        System.out.println("-----신규 폰 구매-----");
    }

    public void turnOn(){

        // 내가 소유하고 있는 객체의 메서드 실행
        // 내 폰의 파워를 켜준다.
        phone.powerOn();
    }

    public void turnOff(){
        phone.powerOff();
    }

    public void watchUtube(){
        if (phone.isOn()) {
            phone.watchUtube();
        }else {
            System.out.println("전원이 꺼져있음");
        }
    }

    public void chargePhone(){
        phone.charge();
    }


}
