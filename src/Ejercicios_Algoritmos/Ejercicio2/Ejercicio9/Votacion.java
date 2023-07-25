package Ejercicios_Algoritmos.Ejercicio2.Ejercicio9;

import javax.swing.*;

public class Votacion {
    public int Ana = 0;
    public int Diego = 0;
    public int votacion;
    public void votacion(){
            for (int i=0;i<10; i ++){

                    votacion=Integer.parseInt(JOptionPane.showInputDialog("Usted vota por: 1. Ana Maria Suarez 2. Diego Acero"));
                    if (votacion==1){
                        Ana ++;

                    }
                    else {
                        Diego ++;
                    }


                }
        if (Ana>Diego){
            System.out.println("La ganadora es Ana Maria Suarez y el perdedor es Diego Acero");
        }
        else {
            System.out.println("El ganador es Diego Acero y la perdedora es Ana MAria Suarez");
        }

            }


    }

