package Customer;

import Student.Student;

public class CustomerTest {
    public static void main(String[] args) {

        Company company = Company.getCompany;
        System.out.println(company);


        Customer cta = new Customer("a", "서울");
        Customer ctb = new Customer("b", "서울");

        System.out.println(cta);
        System.out.println(ctb);
    }
}
