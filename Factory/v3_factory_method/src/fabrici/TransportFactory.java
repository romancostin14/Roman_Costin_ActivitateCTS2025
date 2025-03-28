package fabrici;

import clase.PachetTuristic;
import clase.TransportAutobuz;
import clase.TransportMicrobuz;

public class TransportFactory implements PachetTuristicFactory{
    @Override
    public PachetTuristic crearePachet(TipPachetTuristic tip) {
        return switch (tip){
            case TransportAutobuz-> new TransportAutobuz();
            case TransportMicrobuz-> new TransportMicrobuz();
            default -> null;
        };
    }
}
