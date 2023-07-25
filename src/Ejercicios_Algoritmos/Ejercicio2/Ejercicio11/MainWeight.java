package Ejercicios_Algoritmos.Ejercicio2.Ejercicio11;

import javax.swing.*;

public class MainWeight {
    public static void main(String[] args) {
        Weight weight = new Weight();
        weight.Type = Integer.parseInt(JOptionPane.showInputDialog("Elija el tipo de pago: 1. Moneda 2. Billete"));
        weight.Money =  Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dinero"));
        if (weight.Type == 1) {
            weight.Money();
        } else {
            weight.Bill();
        }
    }
}


