package program;

import clase.AdapterObiecteMedicamente;
import clase.MedicamentFarmacie;
import clase.MedicamentSpital;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void vindeMedicamente(MedicamentFarmacie medicamentFarmacie)
    {
        System.out.println("Bine ati venit la farmacia ACME");
        medicamentFarmacie.cumparaMedicament();
    }
    public static void main(String[] args) {
            MedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie("Paracetamol","23.10.2025",15.3f, true);
            vindeMedicamente(medicamentFarmacie);
            MedicamentSpital medicamentSpital = new MedicamentSpital("Nurofen",15.3f);
            AdapterObiecteMedicamente adapter = new AdapterObiecteMedicamente(medicamentSpital);
            vindeMedicamente(adapter);

    }
    }
