package EjercicioClase;

public class Dispensadora {
    public int dulces;
    public int monto;
    public int chocolatina;
    public int bombon;
    public int papas;
    public String showOption() {
    switch (dulces){
        case 1:{
            if(monto>chocolatina){
                return "Saldo disponible.Adquiera su dulce";
            }else {
                return "No hay saldo";
            }

            } case 2:{
                if (monto>bombon){
                    return "saldo disponible.Adquiera su producto";
                }else {
                    return "no hay saldo disponible";
                }
            } case 3:{
                if (monto>papas){
                    return "Saldo disponoble.Adquiera su dulce";

                }else {
                    return "No hay saldo disponible";
                }
            } default:
            return "No esta disponible el dulce";
    }
    }

}
