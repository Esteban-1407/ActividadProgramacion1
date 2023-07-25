package Ejercicios_Algoritmos.Ejercicio2.Ejercicio15;

public class Figure {

    public void print(){
        for (int i = 0; i < 10; i++) {
            if(i%2 ==0){
                System.out.println("* * * * * * ==================================");
            } else{
                System.out.println(" * * * * * ==================================");
            }
        }
    }
}
