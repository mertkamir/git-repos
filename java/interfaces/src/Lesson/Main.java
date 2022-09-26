package Lesson;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
        CustomerManager customerManager1 = new CustomerManager(new MySqlCustomerDal());

        customerManager.add();
        customerManager1.add();
    }
}
