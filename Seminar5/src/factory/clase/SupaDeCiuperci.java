package factory.clase;

public class SupaDeCiuperci extends FelDeMancare{
    int cantitate;
    public SupaDeCiuperci(float pret, float calorii, int cantitate) {
        super(pret, calorii);
        this.cantitate = cantitate;
    }
}
