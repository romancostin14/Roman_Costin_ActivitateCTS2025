package program;

import clase.PachetTuristic;
import fabrici.CazareFactory;
import fabrici.PachetTuristicFactory;
import fabrici.TipPachetTuristic;
import fabrici.TransportFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PachetTuristicFactory fabrica=new CazareFactory();
        PachetTuristicFactory fabricaTransport=new TransportFactory();

        PachetTuristic pachet=fabrica.crearePachet(TipPachetTuristic.CAZARE_CABANA);
        pachet.afisareDescriere();
        pachet=fabricaTransport.crearePachet(TipPachetTuristic.TransportMicrobuz);
        pachet.afisareDescriere();
    }
}