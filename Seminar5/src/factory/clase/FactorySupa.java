package factory.clase;

public class FactorySupa implements AbstractFactory {
    private int cantitate;


    public FactorySupa(int cantitate) {
        this.cantitate = cantitate;
    }

    @Override
    public FelDeMancare creareFelDeMancare(Enum tipFelDeMancare, float pret, float calorii) {
        if (tipFelDeMancare == null) {
            return null;
        }

        switch ((Supe) tipFelDeMancare) {  // Conversie explicită la tipul enum
            case legume:
                return new SupaDeLegume(pret, calorii, cantitate);
            case ciuperci:
                return new SupaDeCiuperci(pret, calorii, cantitate);
            default:
                return null;
        }
    }

    @Override
    public String toString() {
        return "FactorySupa{" +
                "cantitate=" + cantitate +
                '}';
    }
}
