package Ejercicios_Algoritmos.Ejercicio2.Ejercicio8;

import javax.swing.*;

public class MainTriangulo {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo();
        triangulo.n1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la medida del lado 1"));
        triangulo.n2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la medida del lado 2"));
        triangulo.n3=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la medida del lado 3"));
        triangulo.Equilatero();

    }
}
