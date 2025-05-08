package Spital.program;

import Spital.clase.FabricaPacienti;
import Spital.clase.IPacient;
import Spital.clase.Spitalizare;

public class Program {
    public static void main(String[] args) throws Exception {
        FabricaPacienti fabrica = new FabricaPacienti();
//        IPacient pacient = fabrica.getPacient("0720344347");

            IPacient pacient= fabrica.getPacient("Ion","031283131","ion@gmail.com");


        Spitalizare spitalizare = new Spitalizare(5,7,3);
        Spitalizare spitalizare2 = new Spitalizare(8,3,5);
        Spitalizare spitalizare3 = new Spitalizare(6,7,4);
        pacient.descrierePaient(spitalizare);
        pacient.descrierePaient(spitalizare2);
        fabrica.getPacient("Ioana", "07578321928", "ioana@gmail.com").descrierePaient(spitalizare3);
        fabrica.getPacient("084841213").descrierePaient(spitalizare3);
    }
}
