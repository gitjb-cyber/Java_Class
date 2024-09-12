package intArray;

import java.util.Scanner;

// 배열의 자료구조 구현 - 클래스 작성
// 클래스 = 새로운 자료형
// 변수 - 데이터, 함수 - 반복해서 사용되는 기능 묶어 놓기
public class intArray {
    // 변수 - 클래스의 정보를 담는

    int [] arr = new int[5];
    int size = 0; // 현재 저장된 갯수를 출력 역할 변수

    // 생성자 - 클래스를 통해 메모리에 객체가 생성되면 초기화 담당
    // 클래스의 이름과 동일하게 작성
    public intArray(){
        System.out.println("시작!");
    }

    // 메서드(함수) - 자주 사용되는 코드를 묶어놓은 블록 - 기능
    // 접근제한자 반환값 자료형 함수 이름 (자료형 변수명, 자료형 변수명){}
    // 반환값이 없으면  void 라고 써준다.

    public void add(int num){

        if (size >= arr.length){
            System.out.println("값을 더 이상 추가할 수 없습니다. ");
            return;
        }

        arr[size] = num; // 마지막 위치에다가 숫자를 넣어준다.
        size++; // 등록할 때 마다 size 1개씩 증가
    }

    public void printInfo(){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }


}
