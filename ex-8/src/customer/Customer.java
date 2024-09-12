package customer;
/*
    회사에서 고객 정보 활용한 맞춤 서비스 제공
    - 일반 고객과 우수고객에 따른 서비스 제공
        ㄴ 할인율, 포인트 적립율
        ㄴ 일반 : 0%, 1%
        ㄴ vip : 5%, 10% --- 할인율 추가, 적립율 변경
        ㄴ 우수고객은 전문 상담사를 지정함
        ㄴ 고객 등급도 변경

    - GoldCustomer
    - 할인율 : 3%, 적립율 : 5%
    - 상담사 지정 X
 */
public class Customer {
    // 고객의 속성 : 고객 아이디, 고객이름, 고객 등급, 보너스 포인트, 보너스 포인트 적립비율

    // private 접근제한 / protected - 상속 관계 접근 가능
    protected int customerId;
    protected String customerName;
    protected String grade;
    protected double bonusPoint;
    protected double bonusRatio;

    public Customer(){}

    public Customer(int customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.grade = "silver";
        this.bonusPoint = 0;
        this.bonusRatio = 0.01;
    }


    // 구매를 하면, 보너스 적립율과 할인을 계산해줌
    // 일반 고객은 할인이 없음, 구매 금액 그대로 되돌려줌
    public int calcPrice(int price){
        bonusPoint += (price * bonusRatio);
        return price;
    }

    @Override
    public String toString() {
        return customerName + " 님 : " + grade + " 등급 / 포인트 : " + bonusPoint;
    }
}
