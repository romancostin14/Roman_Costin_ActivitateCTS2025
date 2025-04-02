package restaurant.program;

import restaurant.clase.Rezervare;

public class Program {
    public static void main(String[] args) {
        Rezervare rezervare = new Rezervare("Popescu", 2, "0040720344347");
        Rezervare rezervare2 = (Rezervare) rezervare.clone();
        System.out.println(rezervare2);
    }
}
