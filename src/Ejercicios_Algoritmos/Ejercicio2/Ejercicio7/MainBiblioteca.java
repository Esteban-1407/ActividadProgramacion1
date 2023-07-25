package Ejercicios_Algoritmos.Ejercicio2.Ejercicio7;

import javax.swing.*;

public class MainBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.Operation = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el proceso que desea relizar: 1.DEVOLUCION 2. PERDIDA"));
        biblioteca.ShowOption();

    }
}
