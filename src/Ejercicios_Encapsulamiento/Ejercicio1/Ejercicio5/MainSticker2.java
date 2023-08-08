package Ejercicios_Encapsulamiento.Ejercicio1.Ejercicio5;

import javax.swing.*;

public class MainSticker2 {
    public static void main(String[] args) {
        Sticker2 sticker2 = new Sticker2();
        sticker2.getNumber(Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de stickers")));
        sticker2.getMagnitude(Integer.parseInt(JOptionPane.showInputDialog("Ingrese tamaño de estickers: 1. Pequeño 2. Grande")));
        sticker2.ShowOption();
    }
}


