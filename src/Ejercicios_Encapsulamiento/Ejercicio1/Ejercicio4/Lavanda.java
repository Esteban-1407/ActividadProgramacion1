package Ejercicios_Encapsulamiento.Ejercicio1.Ejercicio4;

import javax.swing.*;

public class Lavanda {
    private int clothes;
    private int service;

    // Getter and Setter for 'clothes'
    public int getClothes() {
        return clothes;
    }

    public void setClothes(int clothes) {
        this.clothes = clothes;
    }

    // Getter and Setter for 'service'
    public int getService() {
        return service;
    }

    public void setService(int service) {
        this.service = service;
    }

    public void showOption() {
        if (service == 1) {
            int type = Integer.parseInt(JOptionPane.showInputDialog("Que tipo de lavado: 1. Normal 2. En seco"));
            switch (type) {
                case 1: {
                    int price = clothes * 2000;
                    System.out.println("El valor a pagar por el servicio son " + price + " pesos");
                    break;
                }
                case 2: {
                    int price = clothes * 1500;
                    System.out.println("El valor a pagar es de " + price + " pesos");
                    break;
                }
            }
        } else {
            int price = clothes * 1800;
            price += 3000;
            System.out.println("El valor a pagar por los servicios es de " + price + " pesos");
        }
    }
}

