package Ejercicios_Algoritmos.Ejercicio2.Ejercicio6;

import javax.swing.*;

public class MainPizza {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        pizza.menu = Integer.parseInt(JOptionPane.showInputDialog("Elija su producto: 1. Pizza 2. Sandwich 3. Ensalada"));
        pizza.amount = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad que desea ordenar"));
        pizza.ShowOption();
    }
    }



