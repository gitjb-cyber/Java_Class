package sirName;
// 함수형(평셔널) 인터페이스 - 메서드를 반드시 1개만 만들어야 함. 여러개 X
// 메서드가 여러개 만들면 오류가 나도록 @FunctionalInterface 에노테이션 붙여줌
// 2개 이상 메서드가 될 때 오류 띄워준다.

@FunctionalInterface
public interface SirName {
    // 이름을 넣으면 '님' 호칭을 붙여서 변환하는 코드

    public String sirName(String name);
}
