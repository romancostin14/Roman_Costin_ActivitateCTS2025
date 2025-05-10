package Adapter.v2_adapter.program;

import Adapter.v2_adapter.clase.OldPrinter;
import Adapter.v2_adapter.clase.Printer;
import Adapter.v2_adapter.clase.PrinterAdapter;

public class Main {
    public static void main(String[] args) {
        OldPrinter vechi = new OldPrinter();

        // Adapter: îl facem să se comporte ca un Printer modern
        Printer imprimanta = new PrinterAdapter(vechi);

        // Codul client funcționează cu interfața modernă
        imprimanta.Print("Rezultatul pacientului");
    }
}
