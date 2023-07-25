package Ejercicios_Algoritmos.Ejercicio2.Ejercicio12;

public class Stadium {
    public int marca;
    public int referencia;

    public String showInfo() {
        switch (marca) {
            case 1: {
                return "su seleccion ha sido chevrolet, por favor selecione que referencia quiere";
            }
            case 2:{
                return "su seleccion ha sido Mazda,por favor sleccione que referencia quiere";
            }
            case 3:{
                return "su sleccion ha sido Renault, por favor seleccione que referencia quiere";
            }
        }

        return null;
    }
    public String Showreferencia() {
        switch (referencia) {
            case 1: {
                return "su elecion ha sido captiva,...";
            }
            case 2: {
                return "su elecion ha sido traker,...";
            }
        }
        return null;
    }
}
