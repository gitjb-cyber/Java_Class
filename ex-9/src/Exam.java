public class Exam {

    public static int num;

    public Exam(){
        num = 10;
    }

    // static 변수를 사용하는 메서드는 반드시 static 을 붙여줘야 한다.
    public static int plusNum(int n)
    {
        num += n;
        return num;
    }

}
