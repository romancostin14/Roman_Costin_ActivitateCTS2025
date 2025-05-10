package v3_composite.clase;



public class Sectie implements Structura {
    private String nume;
    public Sectie(String nume) {
        this.nume = nume;
    }

    @Override
    public void adaugaStructura(Structura structura) throws Exception {
        throw new Exception("Nu a fost implementata");
    }

    @Override
    public void stergeStructura(Structura structura) throws Exception {
        throw new Exception("Nu a fost implementata");
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Sectia " + nume );

    }

    @Override
    public Structura getStructura(int id) {
        return null;
    }
}
