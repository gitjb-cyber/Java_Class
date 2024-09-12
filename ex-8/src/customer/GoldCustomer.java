package customer;

public class GoldCustomer extends Customer{

    private double discountRatio;

    public GoldCustomer(){}

    public GoldCustomer(int customerId, String customerName){
        super(customerId, customerName); // 부모 생성자 호출
        this.grade = "Gold";
        this.bonusRatio = 0.03;
        this.discountRatio = 0.05;
    }

    @Override
    public int calcPrice(int price){
        bonusPoint += (price * bonusRatio);
        return (int) (price * (1 - discountRatio));  // 할인된 가격 계산
    }
}
