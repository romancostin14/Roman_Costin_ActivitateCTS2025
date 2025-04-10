package spital.a3;

public class PersonalNonMedicalFactory implements PersonalFactory {
    @Override
    public PersonalSpital creeazaPersonal(TipPersonal tip, String nume) {
        switch (tip) {
            case SECRETAR:
                return new Secretar(nume);
            case REGISTRATOR:
                return new Registrator(nume);
            default:
                throw new IllegalArgumentException("Tip invalid pentru personal non-medical.");
        }
    }
}
