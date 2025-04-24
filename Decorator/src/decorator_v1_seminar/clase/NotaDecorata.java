package decorator_v1_seminar.clase;

public abstract class NotaDecorata implements Nota {
    public NotaDecorata(Nota nota) {
        this.nota = nota;
    }

    private Nota nota;
    public void printare() {
        nota.printare();
        printareFelicitare();
    }

    abstract void printareFelicitare();
}
