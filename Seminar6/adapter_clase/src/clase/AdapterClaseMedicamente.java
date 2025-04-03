package clase;

public class AdapterClaseMedicamente extends MedicamentSpital implements IMedicamentFarmacie {

    public AdapterClaseMedicamente(String numeMedicament, float pret) {
        super(numeMedicament, pret);
    }

    public AdapterClaseMedicamente(MedicamentSpital medicamentSpital) {
        super(medicamentSpital.getNumeMedicament(), medicamentSpital.getPret());
    }

    @Override
    public void cumparaMedicament() {
        System.out.println("Prin adapter: cumpărare medicament cu verificarea rețetei.");
        achizitioneazaMedicament(); // Calls the hospital method
    }
}
