package FactoryMethod.program;

import FactoryMethod.FactoryPizzaRoma;
import FactoryMethod.FactoryPizzaVegetariana;
import FactoryMethod.IFactory;
import FactoryMethod.IPizza;

public class Program {
    public static void main(String[] args) {
        IFactory factory = null;
        factory = new FactoryPizzaRoma();

        IPizza pizza = null;
        pizza = factory.crearePizza();
        pizza.afisareDescriere();

    }
}
