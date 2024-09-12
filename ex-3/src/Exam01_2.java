public class Exam01_2 {
    public static void main(String[] args) {
        // java switch 문 개선
        // 교재 기입 X

        int studentClass = 4;

        // case의 값을 ','로 값 구분
        // ':' 대신 '->' 변경 ( '-> case 라벨' )
        // break 생략 가능
        switch (studentClass){
            case 1, 2, 3 -> System.out.println("A 그룹");
            case 4, 5, 6 -> System.out.println("B 그룹");
            case 7, 8, 9 -> System.out.println("C 그룹");
            default -> System.out.println("오류");
        }

        // 값을 리턴해서 변수에 저장
        String group = switch (studentClass){
            case 1, 2, 3 -> "A";
            case 4, 5, 6 -> "B";
            case 7, 8, 9 -> "C";
            default -> "오류";
        }; // 마지막 세미콜론 추가

        // 중간에 다른 코드 추가
        // { } 묶어줌, 리턴값은 yield 키워드 붙여줌.
        // 리턴만 할 경우 yield 키워드 사용X, 중괄호X
        String group2 = switch (studentClass){
            case 1, 2, 3 -> {
                System.out.println("에이\t");
                yield "A";
            }
            case 4, 5, 6 -> {
                System.out.println("비\t");
                yield "B";
            }
            case 7, 8, 9 -> {
                System.out.println("씨\t");
                yield "C";
            }
            default -> "오류";
        }; // 마지막 세미콜론 추가

        System.out.println(group2);
    }
}
