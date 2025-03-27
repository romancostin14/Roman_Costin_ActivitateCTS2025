package builder;

import builder.v1_restaurant.Rezervare;
import builder.v1_restaurant.RezervareBuilder;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        RezervareBuilder rezervareBuilder = new RezervareBuilder();
        Rezervare rezervare = rezervareBuilder.setHasRezervareGeam(true).setGenMuzica("ambientala").build("Andrei");
        System.out.println(rezervare);


    }
}