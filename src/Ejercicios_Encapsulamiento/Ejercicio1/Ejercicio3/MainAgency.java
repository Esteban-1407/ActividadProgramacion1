package Ejercicios_Encapsulamiento.Ejercicio1.Ejercicio3;

import javax.swing.*;

public class MainAgency {
    public static void main(String[] args) {
        Agency agency = new Agency();
        agency.setValue((Integer.parseInt(JOptionPane.showInputDialog("Ingrese e monto del inmueble"))));
        agency.setOption(Integer.parseInt(JOptionPane.showInputDialog("Su inmueble es: 1 Usado 2 Nuevo")));
        agency.showOption();
    }

}
