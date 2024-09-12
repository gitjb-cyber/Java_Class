package concat;
// @FunctionalInterface 에노테이션 붙이기
// 인터페이스의 메서드는 1개만 선언
// 사용하는 곳에서 람다식으로 구현해서 사용가능

/*
    인터페이스이름 객체명 = (매개변수) -> {
        // 실행할 내용
    };

    - 실행할 내용이 1줄인 경우 {}; 생략가능
    - 실행할 내용이 return 1줄뿐인 경우 {}; 와 return 생략 가능
    - 매개변수가 1개인 경우도 () 생략 가능


*/

// 문제 - 문자열 2개를 받으면 2개 문자열을 연결해서 출력하는 람다식 구현

@FunctionalInterface
public interface Concat {
    public String concat(String str1, String str2);
}
