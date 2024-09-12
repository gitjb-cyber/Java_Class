package Exam;

public class Cat extends Animal{

    // 추상 클래스를 상속 받은 경우
    // 반드시 추상메서드 재정의
    public Cat(String name, int age)
    {
        super(name, age);
    }
    @Override
    public void cry(){
        System.out.println("야옹");
    }

}
