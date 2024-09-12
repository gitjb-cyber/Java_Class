package number;

public class CompareTo {
    // num1 > num2 -> 1반환
    // num1 = num2 -> 0반환
    // num1 < num2 -> -1반환
    public static void main(String[] args) {
        CompareNumber comp = (x, y) -> {
            return (x > y) ? 1 : (x == y) ? 0 : -1;
        };
        System.out.println(comp.compareTo(2, 1));

        // 반지름을 입력하면, 원의 넓이를 구해주는 람다식
        // Math.PI 이용

        CircleArea rand = a -> (Math.PI) * Math.pow(a, 2); // PI * a^2
        System.out.println(rand.radius(3));
    }
}
