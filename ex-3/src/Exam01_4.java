import java.util.Scanner;

public class Exam01_4 {
    public static void main(String[] args) {
        // 과목코드가
        // 국어 - 1001, 영어 - 2001, 수학 - 3001
        // 과목코드를 입력받으면 해당과목 이름을 출력

        // 상수의 활용
        final int KOR_CODE = 1001;
        final int ENG_CODE = 2001;
        final int MATH_CODE = 3001;

        Scanner sc = new Scanner(System.in);

        System.out.println("과목코드 입력 : ");
        int subjectCode = sc.nextInt();

        String subjectName = switch (subjectCode){
            case KOR_CODE -> "국어";
            case ENG_CODE -> "영어";
            case MATH_CODE -> "수학";
            default -> "없는 과목 코드";
        };
        System.out.println(subjectCode + "/" + subjectName);
    }
}
