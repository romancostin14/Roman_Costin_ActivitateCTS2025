package clase;

public class FactoryCategoria2 implements Factory{
    @Override
    public PachetCazare crearePachetCazare() {
        return new CazareCategoria2();
    }

    @Override
    public PachetTransport crearePachetTransport() {
        return new TransportCategoria2();
    }
}
