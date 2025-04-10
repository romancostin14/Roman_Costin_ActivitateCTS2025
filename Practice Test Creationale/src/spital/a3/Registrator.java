package spital.a3;

public class Registrator extends PersonalSpital{
    public Registrator(String nume) {
        super(nume);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Registrator:" + nume);
    }
}
