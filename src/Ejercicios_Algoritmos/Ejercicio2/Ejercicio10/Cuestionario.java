package Ejercicios_Algoritmos.Ejercicio2.Ejercicio10;

public class Cuestionario {
    public int question1;
    public int question2;
    public int question3;
    public int question4;
    public int question5;
    public int score;

    public void questonary() {
        if (question1 == 1) {
            score += 10;
        } if (question2 == 2) {
            score += 10;
        }  if (question3 == 2) {
            score += 10;
        }  if (question4 == 1) {
            score += 10;
        }  if (question5 == 1) {
            score += 10;
        } else  {
            score -= 10;
        }
        System.out.println("Su nota final del examne es : " + score + " puntos");

    }
}
