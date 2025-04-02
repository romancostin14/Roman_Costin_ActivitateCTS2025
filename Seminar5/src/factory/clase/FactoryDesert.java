package factory.clase;

public class FactoryDesert implements AbstractFactory {
    private String crema;

    public FactoryDesert(String crema) {
        this.crema = crema;
    }

    @Override
    public FelDeMancare creareFelDeMancare(Enum tipFelDeMancare, float pret, float calorii) {
        switch ((Deserturi)tipFelDeMancare) {
            case papanasi -> {
                return new Papanasi(pret,calorii,crema);
            }

            case tiramisu -> {
                return new Tiramisu(pret,calorii,crema);
            }
            default -> throw new IllegalArgumentException("Tip necunoscut de desert!");

        }
    }

}
