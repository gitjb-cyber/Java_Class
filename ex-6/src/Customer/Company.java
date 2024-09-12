package Customer;

// 싱글톤 패턴으로 만들기

public class Company {
    private static Company instance = null;

    private Company(){}

    private static Company getCompany(){
        if (instance == null) {
            instance = new Company();
        }
        return instance;
    }
}
