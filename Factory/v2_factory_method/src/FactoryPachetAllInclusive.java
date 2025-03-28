public class FactoryPachetAllInclusive implements Factory{
    @Override
    public PachetTuristic createPachet() {
        return new PachetAllInclusive();
    }
}
