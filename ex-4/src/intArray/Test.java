package intArray;

public class Test {
    // main 메서드
    public static void main(String[] args) {

        // 클래스로 만든것이 새로운 자료형
        // 클래스명 변수명; - 해당 클래스 대로 만들어진 객체를 연결할 수 있다.

        intArray intArr = new intArray();

        // 배열에 값을 추가하는 기능을 만듦
        intArr.add(15);
        intArr.add(45);
        intArr.add(75);
        intArr.add(105);
        intArr.add(25);

        intArr.printInfo();
        intArr.arr[0] = 1000;
        intArr.printInfo();
    }
}
