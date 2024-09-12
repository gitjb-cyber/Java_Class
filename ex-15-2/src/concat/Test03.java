package concat;

public class Test03 {
    public static void main(String[] args) {

        Concat test = (str1, str2) -> str1 + " " +str2;

        System.out.println(test.concat("홍길동", "강감찬"));

    }
}