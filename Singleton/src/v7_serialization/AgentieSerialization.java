package v7_serialization;

import java.io.Serializable;

public class AgentieSerialization implements Serializable {

    private static final long serialVersionUID = 1L;
    private String numeAgentie;
    private float capital;
    private int numarAngajati;

    private static AgentieSerialization instanta = null;


    private AgentieSerialization(String numeAgentie, float capital, int numarAngajati) {
        this.numeAgentie = numeAgentie;
        this.capital = capital;
        this.numarAngajati = numarAngajati;
    }

    protected Object readResolve() {
        return getInstanta("Nu conteaza", 0, 0);
    }

    public static AgentieSerialization getInstanta(String numeAgentie, float capital, int numarAngajati) {
        if (instanta == null)
            instanta = new AgentieSerialization(numeAgentie, capital, numarAngajati);
        return instanta;
    }

    public String getNumeAgentie() {
        return numeAgentie;
    }

    public void setNumeAgentie(String numeAgentie) {
        this.numeAgentie = numeAgentie;
    }

    public float getCapital() {
        return capital;
    }

    public void setCapital(float capital) {
        this.capital = capital;
    }

    public int getNumarAngajati() {
        return numarAngajati;
    }

    public void setNumarAngajati(int numarAngajati) {
        this.numarAngajati = numarAngajati;
    }
}


