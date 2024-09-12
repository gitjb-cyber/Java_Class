import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        // 2) 1~100 사이 랜덤 숫자 1개
        // 사용자한테 정답을 입력 받아서 맞추게 하기
        // up and down
        // 몇 번만에 맞췄는지?


        Scanner sc = new Scanner(System.in);
        int randInt = (int) (Math.random() * 100) + 1;
        int count = 0;
        while (true){
            System.out.println("숫자 입력 : ");
            int n = sc.nextInt();
            count++;
            System.out.println(count + "번");
            if(n == randInt){
                System.out.println(randInt + " 정답! " + count + "번");
                break;
            }else if(n < randInt){
                System.out.println("up");
            }else if(n > randInt){
                System.out.println("down");
            }
        }
    }
}
