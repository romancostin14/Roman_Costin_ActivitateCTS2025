package v1_composite.clase;

import java.util.ArrayList;
import java.util.List;

public class CategorieMeniu implements ElementMeniu {

    private String denumire;
    private List<ElementMeniu> copii;

    public CategorieMeniu(String denumire ) {
        this.denumire = denumire;
        this.copii = new ArrayList<>();
    }

    public void adauga(ElementMeniu element) {
        copii.add(element);
    }
    @Override
    public void afiseaza(String identare) {
        System.out.println(identare+ denumire + ":");
        for (ElementMeniu copil : copii) {
            copil.afiseaza(identare + "  ");
        }
    }
}
