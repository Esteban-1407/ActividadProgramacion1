package Ejercicios_Algoritmos.Ejercicio2.Ejercicio13;

import javax.swing.*;

public class Stadium {
    public String equipo1;
    public int marcador1;
    public String equipo2;
    public int marcador2;

    public String fecha1;
    public String fecha2;
    public String fecha3;
    public String puesto1;
    public String puesto2;


    public void ShowRanking(){
        if(marcador1>marcador2){
            puesto1 = equipo1;
            puesto2 = equipo2;
            JOptionPane.showMessageDialog(null,"el equipo que optuvo el primer puesto es: " + puesto1 +
                    "\nel segundo puesto es de: "+ puesto2);
        } else if (marcador1<marcador2) {
            puesto1 = equipo2;
            puesto2 = equipo1;
            JOptionPane.showMessageDialog(null,"el equipo que optuvo el primer puesto es: " + puesto1 +
                    "\nel segundo puesto es de: "+ puesto2);
        } else{
            JOptionPane.showMessageDialog(null,"el marcador quedo en empate");
        }
    }
}
