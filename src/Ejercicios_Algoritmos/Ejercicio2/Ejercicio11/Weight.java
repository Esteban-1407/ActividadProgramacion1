package Ejercicios_Algoritmos.Ejercicio2.Ejercicio11;

public class Weight {

    public int Type;
    public int Price = 500;
    public int Money;

    public void Verification() {

        if (Money - Price == 0) {
            System.out.println("Vuelve pronto");
        } else {
            int back = Money - Price;
            System.out.println("Aca esta su devuelta: " + back + " Vuelva pronto");
        }
    }

    public void Money() {
        if (Money == 500 || Money == 1000) {
            Verification();
        } else {
            System.out.println("Ingrese un valor correcto de moneda");
        }
    }

    public void Bill() {
        if (Money == 2000 || Money == 5000) {
            Verification();
        } else {
            System.out.println("Ingrese una cantidad correcta del billete");
        }
    }
}