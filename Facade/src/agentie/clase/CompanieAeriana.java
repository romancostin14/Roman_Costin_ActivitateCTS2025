package agentie.clase;

public class CompanieAeriana {

    private String numeCompanieAeriana;

    public CompanieAeriana(String numeCompanieAeriana) {
        this.numeCompanieAeriana = numeCompanieAeriana;
    }

    @Override
    public String toString() {
        return "CompanieAeriana{" +
                "numeCompanieAeriana='" + numeCompanieAeriana + '\'' +
                '}';
    }

    public Zbor rezervaBiletAvion(String plecare, String destinatie) {
        Zbor zbor=new Zbor(plecare,destinatie,this);
        return zbor;
    }

}
