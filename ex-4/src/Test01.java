import java.util.Arrays;
import java.util.Comparator;

public class Test01 {
    public static void main(String[] args) {
        // 1) 1~100 사이 랜덤 정수 5개 배열에 저장 후 출력
        // 3) 최대값, 최솟값 찾아서 출력
        int [] arr = new int[5];
        int MAX = 0, min = 0;

        for (int i = 0; i < 5; i++) {
            arr[i] = (int) (Math.random() * 100) + 1;
            System.out.println(arr[i]);
        }
        MAX = arr[0];
        min = arr[0];

        for (int i = 0; i < 5; i++){
            if(MAX < arr[i]){
                MAX = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        System.out.println("최댓값 : " + MAX);
        System.out.println("최솟값 : " + min);

        // 배열 출력
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr); // 오름차순 정렬
        System.out.println(Arrays.toString(arr));

        // Arrays.sort(arr, Comparator.reverseOrder());
    }
}
