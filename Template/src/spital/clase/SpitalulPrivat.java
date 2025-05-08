package spital.clase;

public class SpitalulPrivat extends TemplateInternare{

    @Override
    int analizareDificultate(Pacient pacient) {
        return pacient.getGradDificultate();
    }

    @Override
    void verificaDisponibilitate() {
        System.out.println("Avem paturi suficiente");
    }

    @Override
    void emitereFisa(Pacient pacient) {
        System.out.println("Pentru pacientul "+pacient.getNume() + " a fost emisa fisa de internare");
    }
}
