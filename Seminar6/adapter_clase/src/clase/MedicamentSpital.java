package clase;

public class MedicamentSpital
{
    private String numeMedicament;
    private float pret;

    public MedicamentSpital(String numeMedicament, float pret) {
        this.numeMedicament = numeMedicament;
        this.pret = pret;
    }


    public void achizitioneazaMedicament()
    {   prezintaReteta();
        System.out.println("Medicamententul "+this.numeMedicament+ " este achizitionat la pretul "+this.pret);
    }
    public void prezintaReteta(){

        System.out.println("Reteta a fost prezentata pentru medicamentul "+ this.numeMedicament);
    }

    public String getNumeMedicament() {
        return numeMedicament;
    }

    public float getPret() {
        return pret;
    }
}
