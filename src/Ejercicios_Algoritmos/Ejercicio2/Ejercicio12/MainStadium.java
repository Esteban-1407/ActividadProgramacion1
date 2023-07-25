package Ejercicios_Algoritmos.Ejercicio2.Ejercicio12;

import javax.swing.*;

public class MainStadium {
    public static void main(String[] args) {
         Stadium stadium= new Stadium();
        stadium.marca=Integer.parseInt(JOptionPane.showInputDialog("seleccione una marca para su " +
                "vehiculo desehado 1.Chevrolet, 2.Mazda, 3.Renault."));
        stadium.showInfo();
        System.out.println(stadium.showInfo());
        stadium.referencia=Integer.parseInt(JOptionPane.showInputDialog("seleccione una referencia para escoger su vehiculo " +
                "1.captiva, 2.traker"));
        stadium.Showreferencia();
        System.out.println(stadium.Showreferencia());
    }
    }

