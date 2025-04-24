package facade_v3;

import facade_v3.clase.Masa;

public class Facade {

    public String VerificaAsezareMasa(Masa masa) {
        Picollo picollo = new Picollo();
        Ospatar ospatar = new Ospatar();
        picollo.debaraseaza(masa);

        if(masa.isEsteLibera())
        {
            if(picollo.debaraseaza(masa)) {
                if (ospatar.esteAranjata(masa))
                {
                   return "Puteti lua loc la masa " + masa.getNrMasa();
                }
                else{
                    return "Asteptati pana masa va fi aranjata.";
                }
            }
            else{
                return "Asteptati, tocmai s-a ridicat cineva";
            }

        }
        else{
            return "Nu avem locuri disponibile";
        }

    }
}
