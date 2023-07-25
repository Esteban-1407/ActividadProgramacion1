package Ejercicios_Algoritmos.Ejercicio2.Ejercicio4;

import javax.swing.*;

public class Lavanda {
    public int clothes;
    public int service;

    public void ShowOption(){
        if(service==1){
            int type = Integer.parseInt(JOptionPane.showInputDialog("Que tipo de lavado: 1. Normal 2. En seco"));
            switch (type){
                case 1:{
                    int price = clothes * 2000;
                    System.out.println("El valor a pagar por el servicion son " + price + " pesos");
                    break;
                }
                case 2:{
                    int price = clothes * 1500;
                    System.out.println("El valor a pagar es de " + price + " pesos");
                }
            }
        }else {
            int price = clothes * 1800;
            price += 3000;
            System.out.println("el valor a pagar por los servicios es de " + price + " pesos");
        }
    }
}
