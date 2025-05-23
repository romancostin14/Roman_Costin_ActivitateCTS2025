package hotel;

public class Facade {
    public static boolean verificareCamera(int codCamera){
        CamereLibere libere=new CamereLibere();
        if(libere.verificaCameraLibera(codCamera)) {
            Menajera menajera=new Menajera();
            if(menajera.esteCameraCurata(codCamera) && menajera.areProsoapeNoi(codCamera)){
                return true;
            }
            else
            {
                return false;
            }
        }
        else{
            return false;
        }
    }

    public static String verificareDisponibilitateCamera(int codCamera){
        CamereLibere libere=new CamereLibere();
        if(libere.verificaCameraLibera(codCamera)) {
            Menajera menajera=new Menajera();
            if(menajera.esteCameraCurata(codCamera) && menajera.areProsoapeNoi(codCamera)){
                return "Camera este gata";
            }
            else
            {
                return "Asteptati pana se face curat";
            }
        }
        else{
            return "Asteptati pana se elibereaza";
        }
    }
}
