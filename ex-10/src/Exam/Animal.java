package Exam;

// 추상 클래스 : 추상메서드를 가지고 있으면 추상클래스 라고 함, abstract 키워드
// 추상 메서드?
// - 부모 : 메서드 선언만. abstract 키워드
// - 자식 : 상속 받아서 메서드 기능 구현

abstract class Animal {

    String name;
    int age;

    // 추상클래스는 - 직접 객체 생성X
    // 매개변수를 받는 생성자
    // 해결 : 자식 클래스 생성자에서 부모 생성자를 호출하여 값을 넘겨준다.

    public Animal(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    // 추상메서드 - 메서드 선언만
    public abstract void cry ();

    // 일반메서드
    public void sleep(){
        System.out.println("동물이 잠을 잡니다.");
    }

    public void showInfo(){
        System.out.println("동물 이름 : " + name + " / 나이 : " + age);
    }
}
