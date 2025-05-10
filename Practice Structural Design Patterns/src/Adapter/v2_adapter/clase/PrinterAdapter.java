package Adapter.v2_adapter.clase;

public class PrinterAdapter implements Printer {
    private OldPrinter oldPrinter;

    public PrinterAdapter(OldPrinter oldPrinter) {
        this.oldPrinter = oldPrinter;
    }

    @Override
    public void Print(String mesaj) {
        oldPrinter.oldPrinterMethod(mesaj);
    }
}
