package v3_lazyinitialization;

public class Agentie {
    private final String numeAgentie;
    private final float capital;
    private final int numarAngajati;

    private static Agentie instanta = null;

    public Agentie(String numeAgentie, float capital, int numarAngajati) {
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

    public static Agentie getInstanta(String numeAgentie, float capital, int numarAngajati) {
        if(instanta == null) {
            instanta = new Agentie(numeAgentie, capital, numarAngajati);
        }
        return instanta;
    }
}
