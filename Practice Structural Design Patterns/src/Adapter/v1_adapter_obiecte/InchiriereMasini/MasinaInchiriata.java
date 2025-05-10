package Adapter.v1_adapter_obiecte.InchiriereMasini;

public class MasinaInchiriata {
 private Masina masina;

    public MasinaInchiriata(Masina masina) {
        this.masina = masina;
    }

    @Override
    public String toString() {
        return "MasinaInchiriata{" +
                "masina=" + masina +
                '}';
    }

    public void inchiriazaMasina()
    {

        System.out.println("A fost inchiriata masina " +masina.toString());
    }

}
