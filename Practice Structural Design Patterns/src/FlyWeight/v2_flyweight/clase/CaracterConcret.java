package FlyWeight.v2_flyweight.clase;

public class CaracterConcret implements Caracter {
    private char simbol;
    private String font;

    public CaracterConcret(char simbol, String font) {
        this.simbol = simbol;
        this.font = font;
    }

    @Override
    public void afiseaza(int linie, int coloana) {
        System.out.println("Afisez caracterul '" + simbol + "' cu font " + font +
                " la linia " + linie + ", coloana " + coloana);
    }

}