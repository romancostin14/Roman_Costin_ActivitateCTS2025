package factory.clase;

public class SupaDeCiuperci extends FelDeMancare{
    int cantitate;

    @Override
    public String toString() {
        return "SupaDeCiuperci{" +
                "cantitate=" + cantitate +
                ", pret=" + pret +
                ", calorii=" + calorii +
                '}';
    }

    public SupaDeCiuperci(float pret, float calorii, int cantitate) {
        super(pret, calorii);
        this.cantitate = cantitate;


    }
}
