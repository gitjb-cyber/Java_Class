package car;

public class Test01 {

    // 실행 방법 2가지
    // 속도를 증가 또는 감속할 때 마다 - 현재 속도 같이 출력
    // 현재 속도가 0 이하면 감속할 수 없음
    // 최대 속도는 100 까지만 가능 - MAX_SPEED 상수 선언
    // 최대 속도입니다. 출력
    public static void main(String[] args) {



        Car car = new Car("현대", "152가 1234", 0, false);

        // 방법 1
        car.turnOn();
        car.acceleration();
        car.acceleration();
        car.deceleration();
        car.turnOff();
        System.out.println(car);


        System.out.println("\n");


        // 방법 2
        Car.Engine engine = car.new Engine();
        engine.engineOn();
        engine.speedUp();
        engine.speedDown();
        engine.engineOff();
    }


}
