package v3_lazyinitialization;

 public class AgentieLazy {
    private final String numeAgentie;
    private final float capital;
    private final int numarAngajati;

    private static AgentieLazy instanta = null;

    private AgentieLazy(String numeAgentie, float capital, int numarAngajati) {
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

    public static AgentieLazy getInstanta(String numeAgentie, float capital, int numarAngajati) {
        if(instanta == null) {
            instanta = new AgentieLazy(numeAgentie, capital, numarAngajati);
        }
        return instanta;
    }
}
