package SimpleFactory.Program;

import SimpleFactory.ETipPizza;
import SimpleFactory.IPizza;
import SimpleFactory.PizzaFactory;

public class Program {
    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new PizzaFactory();
        IPizza pizza = null;

        try {
            pizza=pizzaFactory.crearePizza(ETipPizza.ROMA);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    pizza.afisareDescriere();
    }
}
