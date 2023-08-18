import java.lang.reflect.Array;

public class MainService {
    public static void main(String[] args) {
        PhoneService[] phoneServices = new PhoneService[2];
        int[][] x = new int[2][3];
        String nombre
        Customer customer = new Customer(1091,"Janka");
        Array.set(phoneServices,0,new PhoneService(customer,"3157158845"));
        System.out.println(phoneServices[0].getPhoneNumber());
    }
}
