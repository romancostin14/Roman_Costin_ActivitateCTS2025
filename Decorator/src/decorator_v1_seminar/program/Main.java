package decorator_v1_seminar.program;

import decorator_v1_seminar.clase.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Nota nota = new NotaPlata(220);
        Nota notaDecorata = new NotaSfarsitDeAn(nota);
  //      notaDecorata.printare();
        Nota notaCraciun = new NotaCraciun(notaDecorata);
        notaCraciun.printare();
    }
}