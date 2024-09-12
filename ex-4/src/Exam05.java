import java.util.Arrays;

public class Exam05 {
    public static void main(String[] args) {
        // 배열 복사
        // 얕은 복사
        // 깊은 복사

        int [] arr = {1, 2, 3, 4, 5};

        // 얕은 복사
        System.out.println("얕은 복사");
        // 값을 변경하면 복사된 것으로 접근해도 동일하게 변경된 값 확인
        int [] brr = arr; // arr 이 가지고 있는 배열의 주소가 brr 에 복사됨

        arr[0] = 10;
        brr[0] = 20;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(brr));

        // 깊은 복사
        System.out.println("깊은 복사");
        // 원본의 값과 상관없이 값이 별도의 메모리 공간에 복사

        int [] card = {1,5,67,3,4,2};
        int [] newCard  = new int[card.length]; // 카드의 길이만큼 할당

        for(int i = 0; i < card.length; i++){
            newCard[i] = card[i];
        }
        newCard[0] = 10;

        System.out.println(Arrays.toString(card));
        System.out.println(Arrays.toString(newCard));

        int [] newCard3  = Arrays.copyOf(card, card.length);
        System.out.println(Arrays.toString(newCard3));

        // 복사한 길이, 위치 등 지정 가능한 메서드
        // 복사할 대상의 인덱스 번호를 넘어가면 에러
        System.arraycopy(card, 0, newCard, 0, card.length);
        // System.arraycopy(원본 배열, 원본 배열의 시작위치, 복사할 배열, 복사할 배열 시작위치, 몇 개 복사할 것인지)


    }
}
