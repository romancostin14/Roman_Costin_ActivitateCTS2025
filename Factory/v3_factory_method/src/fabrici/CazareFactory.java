package fabrici;

import clase.CazareCabana;
import clase.CazareHotel;
import clase.PachetTuristic;

public class CazareFactory implements PachetTuristicFactory{
    @Override
    public PachetTuristic crearePachet(TipPachetTuristic tip) {
        return switch (tip){
            case CAZARE_CABANA -> new CazareCabana();
            case CAZARE_HOTEL -> new CazareHotel();
            default -> null;
        };
    }
}
