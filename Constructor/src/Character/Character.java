package Character;

public class Character {
    private String nombrePersonaje;
    private int daño;
    private int vida;
    private int costoVida;

    public String getNombrePersonaje() {
        return nombrePersonaje;
    }

    public Character(String nombrePersonaje, int daño, int vida, int costoVida) {
        this.nombrePersonaje = nombrePersonaje;
        this.daño = daño;
        this.vida = vida;
        this.costoVida = costoVida;
    }

    public void setNombrePersonaje(String nombrePersonaje) {
        this.nombrePersonaje = nombrePersonaje;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getCostoVida() {
        return costoVida;
    }

    public void setCostoVida(int costoVida) {
        this.costoVida = costoVida;

    }public void move(){}
}
