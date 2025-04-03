package hotel;

import hotel.Facade;

public class Program {

    public static void main(String[] args) {
        System.out.println(Facade.verificareCamera(3));
        System.out.println(Facade.verificareDisponibilitateCamera(3));
    }
}
