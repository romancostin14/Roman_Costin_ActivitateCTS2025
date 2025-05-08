package spital.clase;

public class Pacient {
    private String nume;
    private int gradDificultate;

    public Pacient(String nume, int gradDificultate) {
        this.nume = nume;
        this.gradDificultate = gradDificultate;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getGradDificultate() {
        return gradDificultate;
    }

    public void setGradDificultate(int gradDificultate) {
        this.gradDificultate = gradDificultate;
    }
}
