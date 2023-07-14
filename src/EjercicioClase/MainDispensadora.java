package EjercicioClase;

import java.util.Scanner;

public class MainDispensadora {
    public static void main(String[] args) {
        Dispensadora d = new Dispensadora();

        d.chocolatina= 1000;
        d.papas=2300;
        d.bombon=800;
        d.monto=1500;
        d.dulces =1;
        d.dulces = 2;
        d.dulces = 3;
        Scanner dulce = new Scanner(System.in);
        System.out.println("Ingrese una opcion");
        d.dulces= dulce.nextInt();
        System.out.println(d.showOption());


    }
}
