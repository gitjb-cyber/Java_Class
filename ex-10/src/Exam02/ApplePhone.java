package Exam02;


// ctrl + space

public class ApplePhone implements Phone {

    int batteryCapacity = 40;
    boolean isOn = false;

    @Override
    public void openingLog(){
        System.out.println("ApplePhone");
    }
    @Override
    public void powerOn(){
        if (batteryCapacity > 30) {
            System.out.println("Power ON!!");
            isOn = true;
        }else {
            System.out.println("Low Battery...");
        }
    }

    @Override
    public void powerOff() {
        System.out.println("Power OFF!!");
        isOn = false;
    }

    @Override
    public void charge() {
        if (batteryCapacity < Phone.MAX_BATTERY_CAPACITY - 20) {
            System.out.println("-----Charging------");
            batteryCapacity += 5;
            System.out.println("Charged... " + batteryCapacity + " %");
        }else {
            System.out.println("You don't have to charge....");
            System.out.println("It's enough... " + batteryCapacity + " %");
        }
    }

    @Override
    public boolean isOn() {
        if(isOn){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public void watchUtube() {
        if (batteryCapacity > 15) {
            System.out.println("Watching Youtube....");
            batteryCapacity -= 5;
            System.out.println("Battery : " + batteryCapacity + " %");
        }else {
            System.out.println("Low Battery...");
            powerOff();
        }
    }
}
