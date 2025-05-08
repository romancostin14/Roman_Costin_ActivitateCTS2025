package v3_composite.prgram;

import v3_composite.clase.Departament;
import v3_composite.clase.Sectie;
import v3_composite.clase.Structura;

public class Program {
    public static void main(String[] args) {
        Structura departament1 = new Departament("Pediatrie",23);
        Structura departament2 = new Departament("Icu",23);
        Structura departament3 = new Departament("General",23);

        Sectie sectie1 = new Sectie("sectie1");
        Sectie sectie2 = new Sectie("sectie2");
        Sectie sectie3 = new Sectie("sectie3");

        try {
            departament3.adaugaStructura(departament1);
            departament3.adaugaStructura(departament2);

            departament1.adaugaStructura(sectie1);
            departament2.adaugaStructura(sectie2);
            departament3.adaugaStructura(sectie3);

            departament3.afiseazaDescriere();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
