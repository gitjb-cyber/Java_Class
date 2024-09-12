package Exam;

// Exception 클래스를 상속 받아서
// 내가 원하는 이름으로 예외를 만들어준다. = 클래스 생성
public class InputErrorException extends Exception{

    private String message;
    public InputErrorException(String message){
        this.message = message;
    }

    @Override
    public String getMessage(){
        return message;
    }
}
