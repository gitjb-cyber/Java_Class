package customer;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        // 부모 자료형에 자식 자료형을 넣을 수 있다.
        // 다형성 - 다양한 자료형을 1가지 자료형에 넣어서 사용할 수 있는 것
        // 자식 자료형 -> 부모 자료형에 넣어서 사용 : 자동형변환 - 업캐스팅

        Customer cusHong = new Customer(100, "홍길동");
        Customer cusHan = new GoldCustomer(105, "한사랑");
        Customer cusLee = new VIPCustomer(200, "이몽룡"); // 부모 먼저 꺼내고 자식

        // Customer cusHong = new Customer(100, "홍길동");
        // Customer cusHan = new GoldCustomer(105, "한사랑");
        // Customer cusLee = new VIPCustomer(200, "이몽룡");

        ArrayList<Customer> customerList = new ArrayList<>();
        VIPCustomer cusShin = new VIPCustomer(205, "신사임당");


        // 부모 자료형으로 업캐스팅한 경우
        // ㄴ 자식 자료형에서 추가된 변수 / 메서드 사용X
        // ㄴ 메서드 오버라이딩 한 경우 : 오버라이딩 된 내용으로 실행
        // cusKim.setAgent(100); - 에러, 업캐스팅 되었음
        cusShin.setAgent(200);


        customerList.add(cusHong);
        customerList.add(cusHan);
        customerList.add(cusLee);
        customerList.add(cusShin);

        for(Customer cus : customerList){
            cus.calcPrice(10000);
            System.out.println(cus);
        }

        /*
        System.out.println("Lee 결재액 : " + cusLee.calcPrice(10000));
        System.out.println("Han 결재액 : " + cusKim.calcPrice(10000));
        System.out.println("Kim 결재액 : " + cusKim.calcPrice(10000));

        System.out.println(cusLee);
        System.out.println(cusHan);
        System.out.println(cusKim);
         */
    }
}
