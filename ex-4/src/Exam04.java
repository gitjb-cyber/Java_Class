import java.util.Arrays;
import java.util.Comparator;

public class Exam04 {
    public static void main(String[] args) {
        // 정수의 클래스 자료형
        // int 일반 자료형, Integer : 클래스 자료형 = 참조변수
        Integer [] arr = {1, 7, 4, 3, 5};
        System.out.println("정렬 전 :"+ Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("오름차순 정렬 : " + Arrays.toString(arr));

        // 일반 자료형은 내림차순 정렬 X
        // Integer 클래스 자료형으로 선언된 자료만 내림차순 정렬가능
        Arrays.sort(arr, Comparator.reverseOrder());
        System.out.println("내림차순 정렬 : " + Arrays.toString(arr));


    }
}
