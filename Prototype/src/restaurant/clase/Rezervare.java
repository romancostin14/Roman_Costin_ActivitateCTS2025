package restaurant.clase;

public class Rezervare implements IRezervare {

    private String nume;
    private int nrPersoane;
    private String numarTelefon;

    public Rezervare()
    {

    }

    public Rezervare(String nume, int nrPersoane, String numarTelefon) {
        this.nume = nume;
        if(nrPersoane<1){
            throw new IllegalArgumentException();
        }
        this.nrPersoane = nrPersoane;
        if(!numarTelefon.startsWith("0040")){
            throw new IllegalArgumentException();
        }
        if(numarTelefon.length()<13){
            throw new IllegalArgumentException();
        }
        this.numarTelefon = numarTelefon;
    }

    @Override
    public IRezervare clone() {
        Rezervare rezervare = new Rezervare();
        rezervare.nrPersoane = this.nrPersoane;
        rezervare.numarTelefon = this.numarTelefon;
        rezervare.nume = this.nume;
        return rezervare;

    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "nume='" + nume + '\'' +
                ", nrPersoane=" + nrPersoane +
                ", numarTelefon='" + numarTelefon + '\'' +
                '}';
    }
}
