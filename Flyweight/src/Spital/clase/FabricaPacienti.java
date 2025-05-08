package Spital.clase;

import java.util.HashMap;

public class FabricaPacienti {

    private HashMap<String, IPacient> colectiePacienti;

    public FabricaPacienti() {
    }

    public FabricaPacienti(HashMap<String, IPacient> colectiePacienti) {
        this.colectiePacienti = new HashMap<String,IPacient>();
    }

    public IPacient getPacient(String telefon) throws Exception {
        IPacient pacient = colectiePacienti.get(telefon);
        if(pacient == null) {
            throw new Exception("exceptie");

        }
        return pacient;
    }

    public IPacient getPacient(String nume, String telefon, String adresaEmail ) {
        IPacient pacient = colectiePacienti.get(telefon);
        if(pacient == null) {
            pacient = new Pacient(nume, adresaEmail, telefon);
            colectiePacienti.put(telefon, pacient);

        }
        return pacient;
    }
}
