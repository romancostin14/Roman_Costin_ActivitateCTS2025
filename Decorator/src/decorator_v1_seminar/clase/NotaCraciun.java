package decorator_v1_seminar.clase;

public class NotaCraciun extends NotaDecorata{
    public NotaCraciun(Nota nota) {
        super(nota);
    }

    @Override
    void printareFelicitare() {
        System.out.println("Craciun fericit!");
    }
}
