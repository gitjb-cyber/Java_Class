public class Exam01 {
    public static void main(String[] args) {
        // 제어문 Switch --> if ~ else if ~ else
        // ex
        int score = 87;
        String grade = "";

        switch (score / 10){
            case 9 :
                grade = "A";
                break; // switch문 탈출
            case 8 :
                grade = "B";
                break;
            case 7 :
                grade = "C";
                break;
            case 6 :
                grade = "D";
                break;
            default:
                System.out.println("F");
                break;
        }
        System.out.println(grade);
        /*
        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        }else if (score >= 70) {
            grade = "C";
        }else if (score >= 60) {
            grade = "D";
        }else{
            grade = "F";
        }
        System.out.println(grade);

         */

        // EX 2
        // case가 같은 유형끼리 처리하는 방법
        // 1~3: A 그룹, 4~6: B 그룹, 7~9: C 그룹, 그 외 오류

        int studentClass = 3;

        switch (studentClass){
            case 1:
            case 2:
            case 3:
                System.out.println("A 그룹");
                break;

            case 4: case 5: case 6:
                System.out.println("B 그룹");
                break;
            case 7: case 8: case 9:
                System.out.println("C 그룹");
                break;
            default:
                System.out.println("오류");
                break; // default에 break는 생략 가능
        }
    }
}
