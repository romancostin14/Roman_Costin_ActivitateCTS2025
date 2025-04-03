package agentie.clase;

public class Zbor {
    private CompanieAeriana companie;
    private String orasPlecare;
    private String destinatie;

    public Zbor(String orasPlecare, String destinatie, CompanieAeriana companie) {
        super();
        this.orasPlecare = orasPlecare;
        this.destinatie = destinatie;
        this.companie = companie;
    }


    public CompanieAeriana getCompanieAeriana() {
        return companie;
    }

    public void setCompanieAeriana(CompanieAeriana companieAeriana) {
        this.companie = companieAeriana;
    }

    public String getOrasPlecare() {
        return orasPlecare;
    }

    public void setOrasPlecare(String orasPlecare) {
        this.orasPlecare = orasPlecare;
    }

    public String getDestinatie() {
        return destinatie;
    }

    public void setDestinatie(String destinatie) {
        this.destinatie = destinatie;
    }

    @Override
    public String toString() {
        return "Zbor{" +
                "companieAeriana=" + companie +
                ", orasPlecare='" + orasPlecare + '\'' +
                ", destinatie='" + destinatie + '\'' +
                '}';
    }
}
