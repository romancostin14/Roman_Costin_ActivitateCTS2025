package builder.v2_restaurant;

public class RezervareBuilder implements Builder{
    private final Rezervare rezervare;

    public RezervareBuilder(String nmeClient) {
        rezervare = new Rezervare(false,false,  false,"fara muzica", nmeClient);
    }

    public RezervareBuilder setHasScauneErgonomice(boolean hasScauneErgonomice) {
        rezervare.setHasScauneErgonomice(hasScauneErgonomice);
        return this;
    }
    public RezervareBuilder setHasRezervareGeam(boolean hasRezervareGeam) {
        rezervare.setHasRezervareGeam(hasRezervareGeam);
        return this;
    }
    public RezervareBuilder setGenMuzica(String genMuzica) {
        rezervare.setGenMuzica(genMuzica);
        return this;
    }

    public RezervareBuilder setNumeClient(String numeClient) {
        rezervare.setNumeClient(numeClient);
        return this;
    }

    @Override
    public Rezervare build() {
        return rezervare;
    }
}
