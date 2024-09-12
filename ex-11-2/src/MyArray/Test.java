package MyArray;

public class Test {
    public static void main(String[] args) {
        Stack stack = new Stack(3);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);


        stack.printAll();

        System.out.println(stack.getSize());
        System.out.println("top element is " + stack.pop());
        System.out.println("top element is " + stack.pop());
        stack.printAll();
        System.out.println("top size is " + stack.getSize());


    }
}
