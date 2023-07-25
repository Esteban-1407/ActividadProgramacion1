package Ejercicios_Algoritmos.Ejercicio2.Ejercicio3;

import javax.swing.*;

public class MainAgency {
    public static void main(String[] args) {
        Agency agency = new Agency();
        agency.value=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de su inmueble"));
        agency.option=Integer.parseInt(JOptionPane.showInputDialog("Su inmueble es: 1 Usado 2 Nuevo"));
        agency.showOption();


    }
}
