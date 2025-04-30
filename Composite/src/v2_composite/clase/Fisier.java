package v2_composite.clase;

public class Fisier implements ElementDirector {


    private String denumire;

    public Fisier(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void afiseaza(String identare) {
        System.out.println(identare+ " " + denumire);
    }

}
