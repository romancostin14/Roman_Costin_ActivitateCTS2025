package spital.a3;

public class PersonalMedicalFactory  implements PersonalFactory {
    @Override
    public PersonalSpital creeazaPersonal(TipPersonal tip, String nume) {
        switch (tip) {
            case MEDIC:
                return new Medic(nume);
            case ASISTENT:
                return new Asistent(nume);
            case BRANCARDIER:
                return new Brancardier(nume);
            default:
                throw new IllegalArgumentException("Tip invalid pentru personal medical.");
        }
    }
}