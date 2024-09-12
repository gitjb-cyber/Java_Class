package car;

/*

외부클래스 : Car
    - 변수 : company, carNumber, speed, isPowerOn
        ㄴ 초기값 : 현대, 차번호 (152가 1234), 0, false
    - 메서드 : speedUp - 엔진 클래스의 speedUp 을 실행하는 메서드
             speedDown - 엔진 클래스의 speedDown 을 실행하는 메서드
             turnOn : 엔진 클래스의 engineOn 실행
             turnOff : 엔진 클래스의 engineOff 실행
내부클래스 : Engine
    - 메서드 : speedUp();  -- (메시지)속도를 +10 가속 시킵니다  - speed +10
              speedDown(); -- (메시지)속도를 -10 가속 시킵니다  - speed -10
              engineOn - 시동이 켜졌습니다. - isPowerOn - true
              engineOff - 시동이 꺼졌습니다. - isPowerOff - false


* */
public class Car {

    private final int MAX_SPEED = 100;

    private String company = "현대";
    private String carNumber = "152가 1234";
    private int speed = 0;
    private boolean isPowerOn = false;

    // 내부 클래스 객체명
    private Engine engine;

    public Car(String company, String carNumber, int speed, boolean isPowerOn){
        this.company = company;
        this.carNumber = carNumber;

        engine = new Engine();
    }

    @Override
    public String toString() {
        return "Car{" +
                "company='" + company + '\'' +
                ", carNumber='" + carNumber + '\'' +
                ", speed=" + speed +
                ", isPowerOn=" + isPowerOn +
                '}';
    }

    public String getCompany() {
        return company;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    // 내부클래스 실행하는 메서드
    public void turnOn(){
        engine.engineOn();
    }
    public void turnOff(){
        engine.engineOff();
    }
    public void acceleration(){
        engine.speedUp();

    }
    public void deceleration(){
        engine.speedDown();

    }


    public class Engine{

        public void engineOn(){
            System.out.println("시동 on-----");
            isPowerOn = true;
        }
        public void engineOff(){
            System.out.println("시동이 off----");
            isPowerOn = false;
        }
        public void speedUp(){

            if (!isPowerOn){
                System.out.println("시동을 켜주세요");
                return;
            }

            System.out.println("속도 10 증가" + speed );
            if (speed >= MAX_SPEED){
                System.out.println("최대 속도 입니다.");
                return;
            }
            speed += 10;
        }
        public void speedDown(){

            if (!isPowerOn){
                System.out.println("시동을 켜주세요");
                return;
            }

            System.out.println("속도 10 감소");
            System.out.println("현재 속도는 " + speed + "입니다.");
            speed -= 10;
            if (speed < 0){
                return;

            }
        }
    }

}
