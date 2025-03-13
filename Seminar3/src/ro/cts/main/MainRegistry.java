package ro.cts.main;

import ro.cts.registry.Autoritate;
import ro.cts.registry.Reglementare;

public class MainRegistry {

    public static void main(String[] args) {
        Autoritate autoritate = Autoritate.GetInstance("Autoritate","www.google.ro");
        Reglementare reglementare1 = autoritate.getReglementare("Dacia Logan");
        Reglementare reglementare2 = autoritate.getReglementare("Cybertruck");
        System.out.println(reglementare1);
        System.out.println(reglementare2);

        Reglementare reglementare3 = autoritate.getReglementare("Dacia Logan");
        System.out.println(reglementare3);
    }
}
