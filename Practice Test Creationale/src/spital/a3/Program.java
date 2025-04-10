package spital.a3;

import spital.a3.PersonalFactory;

public class Program {
    public static void main(String[] args) {

        PersonalFactory fabricaMedical = new PersonalMedicalFactory();
        PersonalFactory fabricaNonMedical = new PersonalNonMedicalFactory();

        PersonalSpital p1 = fabricaMedical.creeazaPersonal(TipPersonal.MEDIC, "Dr. Andrei");
        PersonalSpital p2 = fabricaNonMedical.creeazaPersonal(TipPersonal.SECRETAR, "Ionela");

        p1.afiseazaDetalii();
        p2.afiseazaDetalii();

    }
}
