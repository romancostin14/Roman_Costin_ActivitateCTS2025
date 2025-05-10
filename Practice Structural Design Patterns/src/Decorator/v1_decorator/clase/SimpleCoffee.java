package Decorator.v1_decorator.clase;

public class SimpleCoffee implements Coffee {


    @Override
    public String getDescription() {
        return "Cafea simpla";
    }

    @Override
    public double getCost() {
        return 5.0;
    }
}
