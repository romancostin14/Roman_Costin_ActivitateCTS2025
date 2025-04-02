package factory.clase;

public class Papanasi extends FelDeMancare{
    private final String crema;

    public Papanasi(float pret, float calatorii, String crema) {
        super(pret, calatorii);
        this.crema = crema;
    }

    @Override
    public String toString() {
        return "Papanasi{" +
                "crema='" + crema + '\'' +
                '}';
    }
}
