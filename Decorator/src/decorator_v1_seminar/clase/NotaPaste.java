package decorator_v1_seminar.clase;

public class NotaPaste extends NotaDecorata{

    public NotaPaste(Nota nota) {
        super(nota);
    }

    @Override
    void printareFelicitare() {
        System.out.println("Paste fericit!");
    }
}
