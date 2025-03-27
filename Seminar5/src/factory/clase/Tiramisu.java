package factory.clase;

public class Tiramisu extends FelDeMancare {
    private String crema;
    public Tiramisu(float pret, float calorii, String crema) {
        super(pret, calorii);
        this.crema = crema;
    }

    @Override
    public String toString() {
        return "Tiramisu{" +
                "crema='" + crema + '\'' +
                '}';
    }
}
