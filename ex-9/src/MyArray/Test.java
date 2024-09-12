package MyArray;

public class Test {
    public static void main(String[] args) {

        MyArray arr = new MyArray();

        System.out.println(arr.getSize());

        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);

        arr.insert(2,123);
        System.out.println("---------------");
        arr.printAll();

        System.out.println("---------------");
        System.out.println("배열 크기 : " + arr.getSize());

        arr.remove(2);
        System.out.println("---------------");
        arr.printAll();

        System.out.println("---------------");
        System.out.println("배열 크기 : " + arr.getSize());
    }
}
