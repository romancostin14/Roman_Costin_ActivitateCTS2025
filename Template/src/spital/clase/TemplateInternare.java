package spital.clase;

public abstract class TemplateInternare {
   public final void internare(Pacient pacient) {
        if(analizareDificultate(pacient)<3)
        {
            System.out.println("Pacientul " + pacient.getNume()+" nu necesita internare!");
        }
        else{
            verificaDisponibilitate();
            emitereFisa(pacient);
        }
    };

    abstract int analizareDificultate(Pacient pacient);
    abstract void verificaDisponibilitate();
    abstract void emitereFisa(Pacient pacient);

}
