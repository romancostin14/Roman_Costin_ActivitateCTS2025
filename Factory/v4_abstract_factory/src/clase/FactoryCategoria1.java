package clase;

public class FactoryCategoria1 implements Factory{

    @Override
    public PachetCazare crearePachetCazare() {
        return new CazareCategoria1();
    }

    @Override
    public PachetTransport crearePachetTransport() {
        return new TransportCategoria1();
    }
}
