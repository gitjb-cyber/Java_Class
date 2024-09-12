public class Exam02 {
    public static void main(String[] args) {
        // 배열의 변수명 : 참조변수. 주소값만 가지고 있음
        // 인덱스 번호를 이용해서 값에 접근
        // 배열의 길이 : 배열명.length
        // 배열의 초기값 : 정수 0, 실수 0.0, 문자 : '', 객체 : null

        String []str = new String[3];

        str[0] = "hello"; // 리터럴 상수(이름이 없는 상수)
        str[1] = "hi";
        str[2] = "안녕";

        for(String s : str){
            System.out.println(s);
        }
        // ==
        for(int i = 0; i < str.length; i++){
            System.out.println(str[i]);
        }
    }
}
