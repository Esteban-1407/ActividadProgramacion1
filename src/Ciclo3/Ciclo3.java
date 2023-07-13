package Ciclo3;

public class Ciclo3 {
    public int inicio;
    public int termina;
    public void mostrarCiclo(){
        do {
            System.out.println(inicio);
            inicio ++;

        }while (inicio < termina);
    }
}
