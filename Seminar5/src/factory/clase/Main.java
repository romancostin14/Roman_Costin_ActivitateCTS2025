package factory.clase;

public class Main {

    public static void main(String[] args) {

        FactorySupa factorySupa = new FactorySupa(250);
        FactoryDesert factoryDesert = new FactoryDesert("vanilie");
        FelDeMancare supaDeLegume = factorySupa.creareFelDeMancare(Supe.legume,20.5f,450);
        FelDeMancare tiramisu = factoryDesert.creareFelDeMancare(Deserturi.tiramisu,30.4f,500);
        System.out.println(supaDeLegume.toString());
        System.out.println(tiramisu);
    }
}
