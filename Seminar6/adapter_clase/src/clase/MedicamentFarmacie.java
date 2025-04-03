package clase;

public class MedicamentFarmacie implements IMedicamentFarmacie {
    @Override
    public void cumparaMedicament() {
        System.out.println("S-a cumparat medicamentul");
    }

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
}
