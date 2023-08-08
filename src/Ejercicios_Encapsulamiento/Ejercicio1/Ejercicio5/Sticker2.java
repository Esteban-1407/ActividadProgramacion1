package Ejercicios_Encapsulamiento.Ejercicio1.Ejercicio5;

public class Sticker2 {
    private int magnitude;
    private int number;

    public int getMagnitude(int i) {
        return magnitude;
    }

    public void setMagnitude(int magnitude) {
        this.magnitude = magnitude;
    }

    public int getNumber(int ingreseCantidadDeStickers) {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void ShowOption() {
        if (number > 10) {
            switch (magnitude) {
                case 1: {
                    int price = number * 4000;
                    System.out.println("El valor total es de " + price + " pesos");
                    break;
                }
                case 2: {
                    int price = number * 6000;
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



