package Ejercicios_Algoritmos.Ejercicio2.Ejercicio5;

public class Sticker {
    public int size;
    public int amount;



    public void ShowOption() {
        if (amount > 10) {
            switch (size) {
                case 1: {
                    int price = amount * 4000;
                    System.out.println("El valor total es de " + price + " pesos");
                    break;
                }
                case 2: {
                    int price = amount * 6000;
                    System.out.println("El valor total es de " + price + " pesos");
                    break;
                }
                default: {
                    System.out.println("Tamaño de sticker no válido");
                }
            }
        } else {
            System.out.println("Cantidad de stickers no válida");
        }
    }

}
