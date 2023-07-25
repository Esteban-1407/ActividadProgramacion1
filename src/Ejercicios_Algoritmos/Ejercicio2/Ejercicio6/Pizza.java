package Ejercicios_Algoritmos.Ejercicio2.Ejercicio6;

import javax.swing.*;

public class Pizza {
    public int menu;
    public int amount;
    public int sauce;
    public void ShowOption(){

        switch (menu){
            case 1:{
                int price = amount * 7000;
                sauce = Integer.parseInt(JOptionPane.showInputDialog("Desea agregar salsa: 1.si 2. No"));
                if(sauce==1){
                    price += 3000;
                }
                System.out.println("El valor a pagar es de " + price);
                break;

                }

            case 2:{
                int price = amount * 5000;
                sauce = Integer.parseInt(JOptionPane.showInputDialog("Desea agregar salsa: 1.si 2. No"));
                if(sauce==1){
                    price += 3000;
                }
                System.out.println("El valor a pagar es de " + price);
                break;
            }
            case 3 :{
                int price = amount * 15000;
                sauce = Integer.parseInt(JOptionPane.showInputDialog("Desea agregar salsa: 1.si 2. No"));
                if(sauce==1){
                    price += 3000;
                }
                System.out.println("El valor a pagar es de " + price);
                break;
            }
            }

        }
    }

