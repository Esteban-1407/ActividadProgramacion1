package Ejercicios_Encapsulamiento.Ejercicio1.Ejercicio4;

import javax.swing.*;

public class MainLavanda {
    public static void main(String[] args) {
        Lavanda lavanda = new Lavanda();
        lavanda.setService(Integer.parseInt(JOptionPane.showInputDialog("Elija un servicio: 1. Lavado 2. Planchado")));
        lavanda.setClothes(Integer.parseInt(JOptionPane.showInputDialog("Digite cantidad de prendas")));
        lavanda.showOption();
    }
}
