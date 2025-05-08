package spital.program;

import spital.clase.Pacient;
import spital.clase.SpitalulPrivat;
import spital.clase.SpitalulPublic;
import spital.clase.TemplateInternare;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
                Pacient pacient1 = new Pacient("Pacientul 1", 1);
                Pacient pacient2 = new Pacient("Pacientul 2", 4);
                TemplateInternare spital = new SpitalulPublic("spital");
                spital.internare(pacient1);
                spital.internare(pacient2);

                TemplateInternare spitalPrivat = new SpitalulPrivat();
              //  spitalPrivat.internare(pacient1);
                spitalPrivat.internare(pacient2);
        }
    }
