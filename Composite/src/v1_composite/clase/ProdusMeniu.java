package v1_composite.clase;

public class ProdusMeniu implements ElementMeniu {
    private String denumire;

    public ProdusMeniu(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void afiseaza(String identare) {
        System.out.println(identare+ " " + denumire);
    }
}
