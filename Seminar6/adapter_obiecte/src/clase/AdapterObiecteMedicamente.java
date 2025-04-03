package clase;

public class AdapterObiecteMedicamente extends MedicamentFarmacie {
        MedicamentSpital medicamentSpital;


    public AdapterObiecteMedicamente(String numeMedicament, String dataExpirare, float pret, boolean esteInStoc) {
        super(numeMedicament, dataExpirare, pret, esteInStoc);

    }

    public AdapterObiecteMedicamente(MedicamentSpital medicamentSpital) {
        super(medicamentSpital.getNumeMedicament(), "25.09.2022", medicamentSpital.getPret(), true);
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament() {
        medicamentSpital.achizitioneazaMedicament();
    }
}
