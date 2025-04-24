package proxy_v1.clase;

public class Rezervare implements IRezervare {

    public Rezervare() {

    }
    @Override
    public void realizeazaRezervare(String numeClient, int nrPersoane) {
        System.out.println("rezervare realizata pentru "+numeClient+ " si un nr de " + nrPersoane +" persoane");
    }
}
