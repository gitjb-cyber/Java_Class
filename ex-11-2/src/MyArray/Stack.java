package MyArray;
/*
- 맨 마지막 위치(top)에서만 자료를 추가, 삭제, 꺼내올 수 있음(중간의 자료를 꺼낼 수 없음)
- Last In First Out (후입선출) 구조
- 택배 상자가 쌓여있는 모양
- 가장 최근의 자료를 찾아오거나 게임에서 히스토리를 유지하고 이를 무를 때 사용할 수 있음
- 함수의 메모리는 호출 순서에 따른 stack 구조


 */


public class Stack {

    int top;
    MyArray arrayStack;

    public Stack(){
        top = 0;
        arrayStack = new MyArray();
    }

    public Stack(int size){
        arrayStack = new MyArray(size);
    }

    // 추가 - add -> push
    // 삭제 - remove -> pop

    public void push(int data){
        if (isFull()) {
            System.out.println("stack is full");
            return;
        }

        arrayStack.add(data);
        top++;
    }

    public int pop(){
        if(top == 0){
            System.out.println("stack is empty");
            return MyArray.ERROR_NUM;
        }
        return arrayStack.get(--top); // 실제 top 값이 -1이 된다. - 삭제되었기 때문에
    }

    public int peek(){
        if(top == 0){
            System.out.println("stack is empty");
            return MyArray.ERROR_NUM;
        }
        return arrayStack.get(top-1); // top - 1을 뺀 번호를 넘겨줌. top 값 변동없음
    }

    public int getSize(){
        return top;
    }

    public boolean isFull(){
        if(top == arrayStack.ARRAY_SIZE)
        {
            return true;
        }else return false;
    }

    public boolean isEmpty(){
        if(top == 0){
            return true;
        }else return false;
    }

    public void printAll(){
        arrayStack.printAll();
    }

}
