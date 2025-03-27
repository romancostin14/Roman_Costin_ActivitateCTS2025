package factory.clase;

public class SupaDeLegume extends FelDeMancare{
    int cantitate;
    public SupaDeLegume(float pret, float calorii, int cantitate) {
        super(pret, calorii);
        this.cantitate = cantitate;
    }

    @Override
    public String toString() {
        return "SupaDeLegume{" +
                "cantitate=" + cantitate +
                '}';
    }
}
