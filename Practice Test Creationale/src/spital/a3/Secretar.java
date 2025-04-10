package spital.a3;

public class Secretar extends PersonalSpital{
    public Secretar(String nume) {
        super(nume);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Secretar:" + nume);
    }
}
