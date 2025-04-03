package clase;

public class Farmacie {

    private String nume;

    public Farmacie(String nume) {
        this.nume = nume;
    }

    public void vindeMedicament(IMedicamentFarmacie medicament) {
        System.out.println("La farmacia " + this.nume) ;
        medicament.cumparaMedicament();
    }
}
