package Ejercicios_Encapsulamiento.Ejercicio1.Ejercicio2;

public class Cycle2 {
    private int condition1;
    private int condition2;

    public int getCondition1() {
        return condition1;
    }

    public void setCondition1(int condition1) {
        this.condition1 = condition1;
    }

    public int getCondition2() {
        return condition2;
    }

    public void setCondition2(int condition2) {
        this.condition2 = condition2;
    }

    public void mostrarCiclo() {
        for (int i = condition1; i <= condition2; i++) {
            if (i != 5) {
                System.out.println(i);
            }
        }
    }
}
