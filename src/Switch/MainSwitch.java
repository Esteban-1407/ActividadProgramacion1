package Switch;

import java.util.Scanner;

public class MainSwitch {
    public static void main(String[] args) {
        Switch1 switch1 = new Switch1();
        Switch1 b = new Switch1();
        switch1.option=1;
        b.option=2;
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese una opcion");
        b.option= lector.nextInt();

        System.out.println(b.showOption());
    }
}
