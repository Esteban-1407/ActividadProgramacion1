public class PhoneService {
    Customer customer;
    private String phoneNumber;

    public PhoneService(Customer customer, String phoneNumber) {
        this.customer = customer;
        this.phoneNumber = phoneNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "PhoneService{" +
                "customer=" + customer +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
