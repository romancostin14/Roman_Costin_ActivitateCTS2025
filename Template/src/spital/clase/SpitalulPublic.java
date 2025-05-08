package spital.clase;

public class SpitalulPublic extends TemplateInternare {
    private String nume;

    public SpitalulPublic(String nume) {
        this.nume = nume;
    }

    @Override
    int analizareDificultate(Pacient pacient) {
        return pacient.getGradDificultate();
    }

    @Override
    void verificaDisponibilitate() {
        System.out.println("Nu avem paturi suficiente in spitalul " +this.nume);
    }

    @Override
    void emitereFisa(Pacient pacient) {
        System.out.println("Pacientul "+ pacient.getNume()+ " a fost transferat la alt spital");
    }
}
