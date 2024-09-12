public class Exam03 {
    public static void main(String[] args) {
        // 변수 : 값을 저장할 수 있는 메모리 공간, 값이 변경 가능
        // 상수 : 값 변경 불가능
        /*
        리터럴 상수 - 이름 X / 초기값, 직접 써주는 값
        심볼릭 상수 - 이름 O / 내가 직접 만들어 줌
         */
        int a = 10;
        String str = "hello";
        System.out.println("리터럴 상수");

        // 변수 선언과 동일, fanal 키워드 붙임
        // 변수명과 구분하기 위해, 전부 다 대문자로 이름
        // 구분기호는 _로 연결
        // MAX / MAX_BATTERY / ABC_TYPEM / KOREA_NUM
        final int MAX = 100;
        System.out.println(MAX);
        System.out.println("심볼릭 상수");
        // MAX = 200; -> 오류

        final double PI = 3.1419;
        int radius = 5;

        System.out.println("원의 면적 :" + radius * radius * PI);


    }
}
