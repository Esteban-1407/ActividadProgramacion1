package Ejercicios_Algoritmos.Ejercicio2.Ejercicio7;

import javax.swing.*;

public class Biblioteca {
    public int Operation;
    public int type;
    public int days;
    public void ShowOption(){
        if (Operation == 1){
            type = Integer.parseInt(JOptionPane.showInputDialog("Elija la opcion del material prestado: 1. Revista 2.Libro"));
            switch (type){
                case 1 :{
                    days = Integer.parseInt(JOptionPane.showInputDialog("Digite los dias de retraso"));
                    int devolution = days * 500;
                    System.out.println("EL valor a pagar por el retraso es de "  + devolution);
                    break;
                }
                case 2 :{
                    days = Integer.parseInt(JOptionPane.showInputDialog("Digite los dias de retraso"));
                    int devolution = days * 600;
                    System.out.println("EL valor a pagar por el retraso es de "  + devolution);
                    break;

                }
                default:{
                    System.out.println("Opcion invalida");
                }
            }
        }
        else {
            type = Integer.parseInt(JOptionPane.showInputDialog("Digite la catidad de ejemplares perdidos"));
            int price = type * 10000;
            System.out.println("El valor a pagar por la perdida/s es de "+ price);

        }
    }
}
