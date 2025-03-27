package builder.v2_restaurant;

public class Rezervare {
    private boolean hasRezervareGeam;
    private boolean hasScauneErgonomice;
    private boolean hasMasaDecorata;
    private String genMuzica;
    private String numeClient;

    public Rezervare(boolean hasRezervareGeam, boolean hasScauneErgonomice, boolean hasMasaDecorata, String genMuzica, String numeClient) {
        this.hasRezervareGeam = hasRezervareGeam;
        this.hasScauneErgonomice = hasScauneErgonomice;
        this.hasMasaDecorata = hasMasaDecorata;
        this.genMuzica = genMuzica;
        this.numeClient = numeClient;
    }

    public boolean isHasRezervareGeam() {
        return hasRezervareGeam;
    }

    public void setHasRezervareGeam(boolean hasRezervareGeam) {
        this.hasRezervareGeam = hasRezervareGeam;
    }

    public boolean isHasScauneErgonomice() {
        return hasScauneErgonomice;
    }

    public void setHasScauneErgonomice(boolean hasScauneErgonomice) {
        this.hasScauneErgonomice = hasScauneErgonomice;
    }

    public boolean isHasMasaDecorata() {
        return hasMasaDecorata;
    }

    public void setHasMasaDecorata(boolean hasMasaDecorata) {
        this.hasMasaDecorata = hasMasaDecorata;
    }

    public String getGenMuzica() {
        return genMuzica;
    }

    public void setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }
}
