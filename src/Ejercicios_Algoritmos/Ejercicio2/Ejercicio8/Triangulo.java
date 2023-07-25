package Ejercicios_Algoritmos.Ejercicio2.Ejercicio8;

public class Triangulo {
    public int n1;
    public int n2;
    public int n3;
    public void Equilatero(){
        if(n1==n2 && n1==n3){
            System.out.println("El triangulo es equilatero");
        }
        else {
            System.out.println("El triangulo no es equilatero");
        }
    }
}
