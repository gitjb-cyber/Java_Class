
package MyArray;

// 배열은 한번 선언하면, 길이의 추가, 변경이 불가능
// 배열에서 값 추가 - 값을 뒤로 한칸씩 밀어내기
// 배열에서 값 삭제 - 값을 뒤에서 한칸씩 당기기
// ArrayList 동작원리가 유사하다

public class MyArray {
    int[] intArr;    //int array
    int count;        // 데이터 갯수 저장( 배열의 전체 길이x)

    public int ARRAY_SIZE;
    public static final int ERROR_NUM = -999999;

    public MyArray() {
        count = 0;
        ARRAY_SIZE = 5;
        intArr = new int[ARRAY_SIZE];
    }

    public MyArray(int size) {
        count = 0;
        ARRAY_SIZE = size;
        intArr = new int[size];
    }

    public void add(int num) {
        if (count >= ARRAY_SIZE) {
            System.out.println("not enough memory");
            return;
        }

        intArr[count++] = num; // 현재 데이터 갯수 = 다음에 저장할 인덱스 번호
    }

    // 삽일할 인덱스번호, 값
    public void insert(int index, int num) {
        int i;

        // 메모리 꽉찬경우
        if (count >= ARRAY_SIZE) {
            System.out.println("not enough memory");
            return;
        }

        // 범위내에 인덱스가 아닌경우
        // 인덱스번호가 시작번호보다 작거나, 마지막 데이터번호보다 크면
        // ex) size : 3 / 0 ~ 2
        // insert Error 출력하시오
        if (index < 0 || index > count) {
            System.out.println("insert Error");
            return;
        }

        for (i = count - 1; i >= index; i--) {
            intArr[i + 1] = intArr[i];        // 하나씩 이동
        }

        intArr[index] = num;
        count++;

    }


    // 해당 인덱스번호 값 찾아서 삭제
    public void remove(int index) {

        // 1) 만약 비어 있다면
        // There is no element 메시지 출력, 종료

        if (isEmpty() ){
            System.out.println("There is no element");
            return;
        }

        // 2) 인덱스 범위 내에서 벗어나면?
        // remove Error 메시지 출력, 종료
        if(index < 0 || index > count){
            System.out.println("remove Error");
            return;
        }

        // 3) 정상인경우 - 해당 인덱스번호 삭제
        // 한칸씩 앞으로 당겨서 값 덮어씌우기
        // 마지막에 count -1 하기

        for (int i = index; i < count - 1 ; i++) {
            intArr[i] = intArr[i+1];        // 하나씩 이동
        }

        count--;

    }

    public int get(int index){
        if(index < 0 || index > count){
            System.out.println("index Error");
            return ERROR_NUM;
        }
        return intArr[index];
    }

    public int getSize() {
        return count;
    }

    public boolean isEmpty(){
        if(count == 0){
            return true;
        }
        else return false;
    }

    public void printAll()
    {
        if(count == 0){
            System.out.println("출력할 내용이 없습니다.");
            return;
        }

        for(int i=0; i<count; i++){
            System.out.println(intArr[i]);
        }

    }

    public void removeAll()
    {
        for(int i=0; i<count; i++){
            intArr[i] = 0;
        }
        count = 0;
    }
}
