package Agentie.program;

import Agentie.clase.FabricaDePachete;
import Agentie.clase.Optionale;
import Agentie.clase.PachetTuristic;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FabricaDePachete fabricaPachete = new FabricaDePachete();
        Optionale optional1=new Optionale(true, 3);
        Optionale optional2=new Optionale(false, 3);
        Optionale optional3=new Optionale(true, 1);
        Optionale optional4=new Optionale(true, 5);

        PachetTuristic pachet = (PachetTuristic) fabricaPachete.getPachetTuristic(1);
        pachet.descrierePachet(optional1);
        fabricaPachete.getPachetTuristic(2).descrierePachet(optional2);
        optional2.setNrExcursii(40);
        fabricaPachete.getPachetTuristic(2).descrierePachet(optional2);
        fabricaPachete.getPachetTuristic(2).descrierePachet(optional3);
        fabricaPachete.getPachetTuristic(1).descrierePachet(optional4);

        System.out.println(fabricaPachete.getNumarPachete());

	/*	IPachetTuristic pachet1=new PachetTuristic(1, "blabla", "bucuresti", true);

		Optionale op1=new Optionale(true, 3, pachet1);
		Optionale op2=new Optionale(false, 3, pachet1);

		Optionale op3=new Optionale(true, 3, );*/

    }
}