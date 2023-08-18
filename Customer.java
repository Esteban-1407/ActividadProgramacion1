import java.util.PrimitiveIterator;

public class Customer {
    private int cedula;
    private String name;

    public Customer(int cedula, String name) {
        this.cedula = cedula;
        this.name = name;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cedula=" + cedula +
                ", name='" + name + '\'' +
                '}';
    }
}
