package Ejercicios_Algoritmos.Ejercicio2.Ejercicio5;

import javax.swing.*;

public class MainSticker {
    public static void main(String[] args) {
        Sticker sticker = new Sticker();
        sticker.amount = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de stickers"));
        sticker.size = Integer.parseInt(JOptionPane.showInputDialog("Tamaño de sticker: 1. Pequeño 2. Grande"));
        sticker.ShowOption();

    }
}
