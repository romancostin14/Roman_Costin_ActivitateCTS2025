package factory.clase;

public class FelDeMancare {
    private float pret;
    private float calorii;

    public FelDeMancare(float pret, float calorii) {
        this.pret = pret;
        this.calorii = calorii;
    }

    @Override
    public String toString() {
        return "FelDeMancare{" +
                "pret=" + pret +
                ", calorii=" + calorii +
                '}';
    }
}
