package program;

import clase.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void vindeMedicamente(IMedicamentFarmacie medicamentFarmacie)
    {

        medicamentFarmacie.cumparaMedicament();
    }
    public static void main(String[] args) {
        MedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie("Nurofen","22.04.2025",3.5f,true);
        AdapterClaseMedicamente adaptorClaseMedicament = new AdapterClaseMedicamente("Nurofen",12.5f);
        Farmacie farmacie = new Farmacie("Catena");
        farmacie.vindeMedicament(medicamentFarmacie);
        MedicamentSpital medicamentSpital = new MedicamentSpital("Ibuprofen",12.5f);
        AdapterClaseMedicamente adapter2 = new AdapterClaseMedicamente(medicamentSpital);
        vindeMedicamente(adapter2);
        }
    }
