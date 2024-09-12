package MyArray;

// 배열은 한번 선언하면, 길이의 추가, 변경이 불가능
// 배열에서 값 추가 = 값을 뒤로 한칸씩 밀어내기
// 배열에서 값 삭제 = 값을 뒤에서 한칸씩 당기기
// ArrayList 동작원리가 유사하다.



public class MyArray {
    int[] intArr; // int array
    int count;  // 데이터 갯수 저장(배열의 전체 길이X)

    public int ARRAY_SIZE;
    public static final int ERROR_NUM = -999999;

    public MyArray ()
    {
        count = 0;
        ARRAY_SIZE = 5;
        intArr = new int[ARRAY_SIZE];
    }

    public MyArray (int size)
    {
        count = 0;
        ARRAY_SIZE = size;
        intArr = new int[size];
    }

    public void add(int num)
    {
        if (count >= ARRAY_SIZE)
        {
            System.out.println("not enough memory");
            return;
        }
        intArr[count++] = num; // 현재 데이터 갯수 = 다음에 저장할 인덱스 번호
        // == intArr[count] = num; count++;
    }

    // 삽입할 인덱스 번호, 값
    public void insert(int index, int num){

        // 메모리가 꽉찬경우
        if (count >= ARRAY_SIZE) {
            System.out.println("not enough memory");
            return;
        }

        // 범위 내에 인덱스가 아닌 경우
        // 인덱스 변호가 시작번호보다 작거나, 마지막 데이터 번호보다 크면
        // ex) size 3 - 0 ~ 2
        // insert Error 출력

        if (index < 0 || index > count) {
            System.out.println("insert Error");
            return;
        }

        // 중간(index 번째)에 삽입할 경우(num 값을 넣을 경우)
        // index - 1 의 앞부터
        // index + 1 ~ 자리에 이전 수를 복사하여 앞으로 땡겨 넣고
        // index 번째에 num 값을 삽입
        // Ex) 3번째 일 때 2번 반복, 4번째 자리부터 앞으로 복사
        for(int i = count - 1; i >= index; i--) {
            intArr[i + 1] = intArr[i];
        }

        intArr[index] = num;
        count++;

    }

    // 해당 인덱스 번호 값 찾아서 삭제
    public void remove (int index){

        // 1) 만약 비어있다면
        // There is no element 메시지 출력, 종료

        if (isEmpty()) {  // == count == 0
            System.out.println("There is no element");
            return;
        }

        // 2) 인덱스 범위 내에서 벗어나면
        // remove Error 메시지 출력, 종료

        if (index < 0 || index > count) {
            System.out.println("remove Error");
            return;
        }

        // 3) 정상인 경우
        // 해당 인덱스 번호 삭제

        // 한칸씩 앞으로 당겨서 값 덮어씌우기
        // 마지막에 count -1 하기
        for(int i = index; i < count - 1; i++)
        {
            intArr[i] = intArr[i + 1];
        }
        count--;

    }


    public int getSize(){
        return count;
    }


    public boolean isEmpty(){
        if (count == 0) {

            return true;
        }
        else return false;
    }

    public void printAll(){
        if (count == 0) {
            System.out.println("출력할 내용이 없습니다");
            return;
        }

        for (int i = 0; i < count; i++)
        {
            System.out.println(intArr[i]);
        }

    }
    public void removeAll()
    {
        for (int i = 0; i < count; i++){
            intArr[i] = 0;
        }

        count = 0;
    }

}
