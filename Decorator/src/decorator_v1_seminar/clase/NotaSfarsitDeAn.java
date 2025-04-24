package decorator_v1_seminar.clase;

public class NotaSfarsitDeAn extends NotaDecorata{
    public NotaSfarsitDeAn(Nota nota) {
        super(nota);
    }

    @Override
    void printareFelicitare() {
        System.out.println("An nou fericit!");
    }
}
