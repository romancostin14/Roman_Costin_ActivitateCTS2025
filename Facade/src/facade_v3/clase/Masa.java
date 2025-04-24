package facade_v3.clase;

public class Masa {
    private int nrMasa;
    private boolean esteLibera;

    public Masa(int nrMasa, boolean esteLibera) {
        this.nrMasa = nrMasa;
        this.esteLibera = esteLibera;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public boolean isEsteLibera() {
        return esteLibera;
    }

    @Override
    public String toString() {
        return "Masa{" +
                "nrMasa=" + nrMasa +
                ", esteLibera=" + esteLibera +
                '}';
    }
}
