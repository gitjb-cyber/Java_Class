package customer;

public class VIPCustomer extends Customer{ // Customer 기능 확장

    // 추가
    // 상담사 배정 - 상담사의 고유번호를 저장할 수 있도록 한다
    // 할인율

    // 변경
    // 고객등급
    // calcPrice 에서 할인율 계산
    // 포인트 적립율

    private int agent;
    private double discountRatio;

    // 접근제한자
    // 상속관계에서 접근 가능하도록 private 로 변경(부모에서)
    public VIPCustomer(){}

    // 자식클래스로 객체를 만들면
    // ㄴ 부모 생성자를 먼저 호출해서 부모의 객체로 생성하고
    // ㄴ 자식 생성자를 호출해서 자식 객체의 추가 / 변경되는 부분들 반영
    // - 그래서 반드시 부모 생성자 먼저 호출
    public VIPCustomer(int customerId, String customerName){
        super(customerId, customerName); // 부모 생성자 호출
        this.agent = 100;
        this.grade = "VIP";
        this.bonusRatio = 0.05;
        this.discountRatio = 0.1;

        /*
        this.customerId = customerId;
        this.customerName = customerName;
        this.grade = "VIP";
        this.bonusRatio = 0.03;
        this.discountRatio = 0.05;
         */
    }

    public int getAgent() {
        return agent;
    }

    public void setAgent(int agent) {
        this.agent = agent;
    }

    // 상속관계에서 메서드의 내용변경 - override
    @Override
    public int calcPrice(int price){
        bonusPoint += (price * bonusRatio);
        return (int) (price * (1 - discountRatio));  // 할인된 가격 계산
    }

}
