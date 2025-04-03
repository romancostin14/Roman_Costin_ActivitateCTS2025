package clase;

public class MedicamentFarmacie {
   private String numeMedicament;
   private String dataExpirare;
   private float pret;
   private boolean esteInStoc;

    public MedicamentFarmacie(String numeMedicament, String dataExpirare, float pret, boolean esteInStoc) {
        this.numeMedicament = numeMedicament;
        this.dataExpirare = dataExpirare;
        this.pret = pret;
        this.esteInStoc = esteInStoc;
    }

    public void cumparaMedicament()
    {
        System.out.println("Medicamentul" + this. numeMedicament+ " care expira la data "+this.dataExpirare+ " a fost cumparat la pretul de "+this.pret);

    }

}
