package oferte.program;

import oferte.deep.IListaOferte;
import oferte.deep.ListaOferte;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        IListaOferte listaOferte = new ListaOferte();
        listaOferte.incarcaListaOferte();

        IListaOferte copieListaOferte =null;
        copieListaOferte = listaOferte.copiaza();
        System.out.println(copieListaOferte);
    }
}