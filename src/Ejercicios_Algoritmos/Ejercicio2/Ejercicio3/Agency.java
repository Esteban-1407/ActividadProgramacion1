package Ejercicios_Algoritmos.Ejercicio2.Ejercicio3;

public class Agency {
    public int value;
    public int option;

    public void showOption() {
        switch (option) {
            case 1: {
                double comission = value * 0.10;
                double rest = value - comission;
                System.out.println( "La comision de la inmobilaria es " + comission + " y el ingreso del usuario es " + rest);
                break;

            }
            case 2: {
                double comission = value * 0.12;
                double rest = value - comission;
                System.out.println( "La comision de la inmobilaria es " + comission + " y el ingreso del usuario es " + rest);
                break;

            }
        }
    }
}


