package Ejercicios_Algoritmos.Ejercicio2.Ejercicio4;

import javax.swing.*;

public class MainLavanda {
    public static void main(String[] args) {
        Lavanda lavanda = new Lavanda();
        lavanda.service = Integer.parseInt(JOptionPane.showInputDialog("Elija un servicio: 1. Lavado 2. Planchado"));
        lavanda.clothes = Integer.parseInt(JOptionPane.showInputDialog("Digite cantidad de prendas"));
        lavanda.ShowOption();

    }
}
