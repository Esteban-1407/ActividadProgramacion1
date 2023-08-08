package Ejercicios_Encapsulamiento.Ejercicio1.Ejercicio3;

public class Agency {
    private int value;
    private int option;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getOption() {
        return option;
    }

    public void setOption(int option) {
        this.option = option;
    }

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
