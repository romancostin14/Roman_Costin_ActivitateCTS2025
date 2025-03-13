package ro.cts.clase;

public class AutoritateReglementareMasiniLazy {


    private final String nume;
    private String webSite;
    private final int nrReglementari;
    private static AutoritateReglementareMasiniLazy instance = null;

    public AutoritateReglementareMasiniLazy(String nume, String webSite, int nrReglementari) {
        this.nume = nume;
        this.webSite = webSite;
        this.nrReglementari = nrReglementari;
    }

    public static synchronized AutoritateReglementareMasiniLazy getInstance(String nume, String webSite, int nrReglementari) {
        if(instance == null){
         instance = new AutoritateReglementareMasiniLazy(nume, webSite, nrReglementari );
        }
        return instance;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    @Override
    public String toString() {
        return "ro.cts.clase.AutoritateReglementareMasiniLazy{" +
                "nume='" + nume + '\'' +
                ", webSite='" + webSite + '\'' +
                ", nrReglementari=" + nrReglementari +
                '}';
    }
}
