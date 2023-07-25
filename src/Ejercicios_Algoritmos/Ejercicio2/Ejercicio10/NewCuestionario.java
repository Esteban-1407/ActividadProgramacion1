package Ejercicios_Algoritmos.Ejercicio2.Ejercicio10;

import javax.swing.*;

public class NewCuestionario {
    public static void main(String[] args) {
        Cuestionario cuestionario = new Cuestionario();
        cuestionario.question1 = Integer.parseInt(JOptionPane.showInputDialog("El cuadro tiene 4 lados: 1. V 2.F"));
        cuestionario.question2 = Integer.parseInt(JOptionPane.showInputDialog("Equilatero significa lados diferentes: 1. V 2.F "));
        cuestionario.question3 = Integer.parseInt(JOptionPane.showInputDialog("Oppenhaimmer es el creador de la bomba atomica: 1. F 2.V"));
        cuestionario.question4 = Integer.parseInt(JOptionPane.showInputDialog("Javascrip es un lenguaje de programacion: 1. V 2. F"));
        cuestionario.question5 = Integer.parseInt(JOptionPane.showInputDialog("Html da estructura a la pagina: 1. V 2.F"));
        cuestionario.questonary();

    }
}
