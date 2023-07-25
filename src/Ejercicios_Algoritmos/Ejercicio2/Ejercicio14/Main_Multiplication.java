package Ejercicios_Algoritmos.Ejercicio2.Ejercicio14;

import java.util.Scanner;

public class Main_Multiplication {
    public static void main(String[] args) {
        Multiplication_Table multiplicationTable = new Multiplication_Table();
        Scanner lector = new Scanner(System.in);

        System.out.println("Type a number to see its multiplication table");
        multiplicationTable.number = lector.nextInt();
        multiplicationTable.table();
    }

    }

