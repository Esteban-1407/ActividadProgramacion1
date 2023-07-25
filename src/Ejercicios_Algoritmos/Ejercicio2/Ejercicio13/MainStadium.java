package Ejercicios_Algoritmos.Ejercicio2.Ejercicio13;

import javax.swing.*;

public class MainStadium {
    public static void main(String[] args) {
        Stadium equipos = new Stadium();
        equipos.equipo1= JOptionPane.showInputDialog("ingrese el nombre del primer equipo: ");
        equipos.marcador1=Integer.parseInt(JOptionPane.showInputDialog("ingrese el marcador del primer equipo: "));
        equipos.equipo2=JOptionPane.showInputDialog("ingrese el nombre del segundo equipo: ");
        equipos.marcador2=Integer.parseInt(JOptionPane.showInputDialog("ingrese el marcador del segundo equipo: "));
        equipos.fecha1=JOptionPane.showInputDialog(" ingrese la primera fecha: ");
        equipos.fecha2=JOptionPane.showInputDialog(" intgrse la segunda fecha: ");
        equipos.fecha3=JOptionPane.showInputDialog(" ingrese la tercera fecha: ");
        equipos.ShowRanking();

    }

    }

