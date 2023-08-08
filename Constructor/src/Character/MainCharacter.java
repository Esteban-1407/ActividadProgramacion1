package Character;

public class MainCharacter {
    public static void main(String[] args) {
        Character valquria = new Character("Valquiria",1200, 450,4);
        Character minipekka = new Character("MiniPekka", 2000,750,5);
        Deck deck1 = new Deck(8, 4, "GOD", 5);
        Arena arena = new Arena();
        Arena arena2 = new Arena(23);
        Arena arena3 = new Arena(23,3268);
        Arena arena4 = new Arena(23,5555, 1200);
    }
}
