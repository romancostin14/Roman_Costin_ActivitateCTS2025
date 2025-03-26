package v4_threadsafe;

public class AgentieThreadSafe {

    private String numeAgentie;
    private float capital;
    private int numarAngajati;

    private static AgentieThreadSafe instanta = null;

    public AgentieThreadSafe(String numeAgentie, float capital, int numarAngajati) {
        this.numeAgentie = numeAgentie;
        this.capital = capital;
        this.numarAngajati = numarAngajati;
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

    public static synchronized AgentieThreadSafe getInstanta(String numeAgentie, float capital, int numarAngajati) {

        if(instanta == null) {
            instanta = new AgentieThreadSafe(numeAgentie, capital, numarAngajati);
        }
        return instanta;
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
}
