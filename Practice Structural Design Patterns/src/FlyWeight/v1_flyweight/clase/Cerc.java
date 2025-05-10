package FlyWeight.v1_flyweight.clase;

public class Cerc implements Forma {
    private String culoare; // proprietate intrinsecă

    public Cerc(String culoare) {
        this.culoare = culoare;
    }

    @Override
    public void deseneaza(int x, int y) {
        System.out.println("Desenez un cerc de culoare " + culoare + " la poziția (" + x + "," + y + ")");
    }
}
