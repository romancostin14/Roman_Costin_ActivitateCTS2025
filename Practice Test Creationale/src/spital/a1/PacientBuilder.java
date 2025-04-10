package spital.a1;

public class PacientBuilder implements  Builder{
    private final Pacient pacient;

    public PacientBuilder(String nume) {
        pacient = new Pacient(nume,false,false,false,false);
    }

    public PacientBuilder setHasPatRabatabil()
    {
        pacient.setPatRabatabil(true);
        return this;
    }

    public PacientBuilder setHasMicDejunInclus()
    {
        pacient.setMicDejunInclus(true);
        return this;
    }

    public PacientBuilder setHasPapuciCamera()
    {
        pacient.setPapuciCamera(true);
        return this;
    }

    public PacientBuilder setHasHalatInterior()
    {
        pacient.setHalatInterior(true);
        return this;
    }


    @Override
    public Pacient build() {
        return pacient;
    }
}
