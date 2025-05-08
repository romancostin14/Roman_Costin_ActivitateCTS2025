package v3_composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Departament implements Structura {

    private String nume;
    private int nrAngajati;
    private List<Structura> lista;


    public Departament(String nume, int nrAngajati) {
        this.nume = nume;
        this.nrAngajati = nrAngajati;
        this.lista = new ArrayList<>();
    }


    @Override
    public void adaugaStructura(Structura structura) throws Exception {
        lista.add(structura);
    }

    @Override
    public void stergeStructura(Structura structura) throws Exception {
        lista.remove(structura);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Sectia" + nume + " " + nrAngajati+ " si urmatoarele subsectii:");
        for(Structura structura : lista) {
            structura.afiseazaDescriere();
        }
    }

    @Override
    public Structura getStructura(int id) {
        return null;
    }
}

