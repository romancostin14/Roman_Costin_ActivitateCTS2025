package v2_composite.clase;

import java.util.ArrayList;

public class Director implements ElementDirector{
    private String denumire;
    private ArrayList<ElementDirector> copii;

    public Director(String denumire) {
        this.denumire = denumire;
        this.copii = new ArrayList<>();
    }

    @Override
    public void afiseaza(String identare) {
        System.out.println(identare+ denumire + ":");
        for (ElementDirector copil : copii) {
            copil.afiseaza(identare + "  ");
        }
    }

    public void adauga(ElementDirector copil) {
        copii.add(copil);
    }
}
