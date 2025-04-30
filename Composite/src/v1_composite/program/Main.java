package v1_composite.program;

import v1_composite.clase.CategorieMeniu;
import v1_composite.clase.ProdusMeniu;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CategorieMeniu meniuPrincipal = new CategorieMeniu("Meniu");
        CategorieMeniu startere = new CategorieMeniu("Startere");
        startere.adauga(new ProdusMeniu("Bruschete"));
        startere.adauga(new ProdusMeniu("Platou mixt"));

        CategorieMeniu bauturi = new CategorieMeniu("Bauturi");
        CategorieMeniu sucuri = new CategorieMeniu("Sucuri");
        sucuri.adauga(new ProdusMeniu("Coca-Cola"));
        sucuri.adauga(new ProdusMeniu("Fanta"));

        CategorieMeniu cafea = new CategorieMeniu("Cafea");
        cafea.adauga(new ProdusMeniu("Espresso"));
        cafea.adauga(new ProdusMeniu("Cappucino"));

        bauturi.adauga(sucuri);
        bauturi.adauga(cafea);

        bauturi.adauga( new ProdusMeniu("Apa plata"));
        bauturi.adauga(new ProdusMeniu("Apa minerala"));

        CategorieMeniu desert = new CategorieMeniu("Desert");
        desert.adauga(new ProdusMeniu("Papanasi"));
        desert.adauga(new ProdusMeniu("Tiramisu"));

        meniuPrincipal.adauga(startere);
        meniuPrincipal.adauga(bauturi);
        meniuPrincipal.adauga(desert);
        meniuPrincipal.afiseaza(" ");
    }
}