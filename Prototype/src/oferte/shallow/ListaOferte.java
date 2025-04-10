package oferte.shallow;

import oferte.deep.IListaOferte;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ListaOferte implements IListaOferte {

    private List<String> oferte;

    public ListaOferte() {
        oferte = new ArrayList<String>();
    }
    @Override
    public IListaOferte copiaza() {
        try {
            return (IListaOferte) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void incarcaListaOferte() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("oferte.txt"));
            String oferta=null;
            while((oferta=br.readLine())!=null)
            {
                oferte.add(oferta);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "ListaOferte{" +
                "oferte=" + oferte +
                '}';
    }
}
