package spital.a3;

public abstract class PersonalSpital {
    protected String nume;

    public PersonalSpital(String nume) {
        this.nume = nume;
    }

    public abstract void afiseazaDetalii();
}
