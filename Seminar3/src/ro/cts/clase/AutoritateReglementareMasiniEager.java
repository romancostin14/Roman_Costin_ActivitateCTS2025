package ro.cts.clase;

public class AutoritateReglementareMasiniEager
{
    private final String nume;
    private String webSite;
    private int nrReglementari;
    private static final AutoritateReglementareMasiniEager instance= new AutoritateReglementareMasiniEager("Autoritate Auto","www.autoritateAuto.ro",4);

    private AutoritateReglementareMasiniEager(String nume, String webSite, int nrReglementari) {
        this.nume = nume;
        this.webSite = webSite;
        this.nrReglementari = nrReglementari;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public String getWebSite() {
        return webSite;
    }


    public void reglementeazaModel(String nume){
        nrReglementari++;
    }

    public static AutoritateReglementareMasiniEager getInstance() {
        return instance;
    }

    @Override
    public String toString() {
        return "ro.cts.clase.AutoritateReglementareMasiniEager{" +
                "nume='" + nume + '\'' +
                ", webSite='" + webSite + '\'' +
                ", nrReglementari=" + nrReglementari +
                '}';
    }
}
