package factory.clase;

public class FactoryDesert implements AbstractFactory {
    private String crema;

    public FactoryDesert(String crema) {
        this.crema = crema;
    }

    @Override
    public FelDeMancare creareFelDeMancare(Enum tipFelDeMancare, float pret, float calorii) {
        switch (tipFelDeMancare) {
            case Deserturi.papanasi -> {
                return new Papanasi(pret,calorii,crema);
            }

            case Deserturi.tiramisu -> {
                return new Tiramisu(pret,calorii,crema);
            }

            case null, default -> {
                return null;
            }
        }
    }

}
