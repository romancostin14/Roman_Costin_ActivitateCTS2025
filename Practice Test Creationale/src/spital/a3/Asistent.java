package spital.a3;

public class Asistent extends PersonalSpital{

    public Asistent(String nume) {
        super(nume);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Asistent:" + nume);
    }
}
