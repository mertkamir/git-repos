package Lesson;

public class CustomerManager {

    private ICustomerDal customerDal;

    public CustomerManager (ICustomerDal customerDal) {
        this.customerDal = customerDal;
    }

    public void add() {
        // business codes
        customerDal.Add();
    }
}
