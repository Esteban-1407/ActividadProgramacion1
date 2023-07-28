package Character;

public class Deck {
    private int numeroDeCartas;
    private int promedioElixir;
    private String calidadcarta;
    private int nivelCartas;

    public int getNumeroDeCartas() {
        return numeroDeCartas;
    }

    public void setNumeroDeCartas(int numeroDeCartas) {
        this.numeroDeCartas = numeroDeCartas;
    }

    public int getPromedioElixir() {
        return promedioElixir;
    }

    public void setPromedioElixir(int promedioElixir) {
        this.promedioElixir = promedioElixir;
    }

    public String getCalidadcarta() {
        return calidadcarta;
    }

    public void setCalidadcarta(String calidadcarta) {
        this.calidadcarta = calidadcarta;
    }

    public Deck(int numeroDeCartas, int promedioElixir, String calidadcarta, int nivelCartas) {
        this.numeroDeCartas = numeroDeCartas;
        this.promedioElixir = promedioElixir;
        this.calidadcarta = calidadcarta;
        this.nivelCartas = nivelCartas;
    }

    public int getNivelCartas() {
        return nivelCartas;

    }

    public void setNivelCartas(int nivelCartas) {
        this.nivelCartas = nivelCartas;
    }
}
