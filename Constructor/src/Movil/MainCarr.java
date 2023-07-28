package Movil;

public class MainCarr {
    public static void main(String[] args) {
        Carr carr = new Carr("jfh107",324);
        carr.setModel(1407);
        carr.setPlate("AAA000");
        System.out.println(carr.getModel());
        System.out.println(carr.getPlate());

    }
}
