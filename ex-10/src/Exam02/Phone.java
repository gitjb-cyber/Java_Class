package Exam02;

// 공통점 : 스스로 객체 생성 못함
/*
 추상클래스 :
            - 클래스들의 공통 메서드를 추출하여 선언, 자깃들이 상속받아 구현
            - 자식 클래스에게 기본 틀(부모 추상 메서드)과 공통 기능(부모 일반메서드) 제공
            - 상속O, 자식클래스
            - 추상 메서드, 일반 메서드(구현 O)도 있고, 변수도 존재

 인터페이스 :
            - 구현 클래스의 기본 틀 제공
            ★ 다른 클래스 코드 사이에 중간 매개역할
            - 모든 메서드가 = 추상 메서드(메서드의 선언만 있다.)
            - 상속개념 X, 구형클래스
*/

public interface Phone {

    // 구성요소
    // 1) 상수 - public static final 로 선언
    // 객체를 생성할 수 없기 때문에 static 르로 선언,
    // 인터페이스이름.변수명 ---> 접근 가능하도록 하기 위함
    public static final int MAX_BATTERY_CAPACITY = 100;

    // 2) 추상메서드
    // - 모든 메서드가 구현하지 않음. 선언만.
    // - 기본틀의 역할 - 구현 클래스에서 각각 구현
    abstract void openingLog();
    abstract void powerOn();
    abstract void powerOff();
    abstract void charge();
    abstract boolean isOn();
    abstract void watchUtube();

}
