package factory.clase;

public class FactorySupa implements AbstractFactory {
    private int cantitate;


    public FactorySupa(int cantitate) {
        this.cantitate = cantitate;
    }

    @Override
    public FelDeMancare creareFelDeMancare(Enum tipFelDeMancare, float pret, float calorii) {
        switch (tipFelDeMancare) {
            case Supe.legume -> {
                return new SupaDeLegume(pret, calorii, cantitate);
            }

            case Supe.ciuperci -> {
                return new SupaDeCiuperci(pret, calorii, cantitate);
            }

            case null, default -> {
                return null;
            }
        }
    }

    @Override
    public String toString() {
        return "FactorySupa{" +
                "cantitate=" + cantitate +
                '}';
    }
}
