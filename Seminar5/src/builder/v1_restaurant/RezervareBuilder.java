package builder.v1_restaurant;

public class RezervareBuilder implements Builder
{

    private boolean hasRezervareGeam;
    private boolean hasScauneErgonomice;
    private boolean hasMasaDecorata;
    private String genMuzica;
    private String numeClient;

    public RezervareBuilder()	{
        hasMasaDecorata = false;
        hasRezervareGeam = false;
        hasScauneErgonomice = false;
        genMuzica = "Fara muzica";
        numeClient = "-";
    }

    @Override
    public Rezervare build(String numeClient) {
        return new Rezervare(hasRezervareGeam,hasScauneErgonomice,hasMasaDecorata,genMuzica,numeClient);
    }

    public RezervareBuilder setHasRezervareGeam(boolean hasRezervareGeam) {
        this.hasRezervareGeam = hasRezervareGeam;
        return this;
    }

    public RezervareBuilder setHasScauneErgonomice(boolean hasScauneErgonomice) {
        this.hasScauneErgonomice = hasScauneErgonomice;
        return this;
    }

    public RezervareBuilder setHasMasaDecorata(boolean hasMasaDecorata) {
        this.hasMasaDecorata = hasMasaDecorata;
        return this;
    }

    public  RezervareBuilder setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
        return this;
    }

    public  RezervareBuilder setNumeClient(String numeClient) {
        this.numeClient = numeClient;
        return this;
    }
}
