package v1_eagerinitialization;

public class AgentieEager {
    private String numeAgentie;
    private float capital;
    private int numarAngajati;

    private static final AgentieEager instanta = new AgentieEager();

    private AgentieEager() {
        this.numeAgentie = "AgeTur";
        this.capital = 1000;
        this.numarAngajati = 5;
    }

    public String getNumeAgentie() {
        return numeAgentie;
    }

    public float getCapital() {
        return capital;
    }

    public int getNumarAngajati() {
        return numarAngajati;
    }

    public void setNumeAgentie(String numeAgentie) {
        this.numeAgentie = numeAgentie;
    }

    public void setCapital(float capital) {
        this.capital = capital;
    }

    public void setNumarAngajati(int numarAngajati) {
        this.numarAngajati = numarAngajati;
    }

    public static AgentieEager getInstance() {
        return instanta;
    }

    @Override
    public String toString() {
        return "AgentieEager{" +
                "numeAgentie='" + numeAgentie + '\'' +
                ", capital=" + capital +
                ", numarAngajati=" + numarAngajati +
                '}';
    }
}
