package Decorator.v1_decorator.clase;

public class FriscaDecorator extends CoffeeDecorator{
    public FriscaDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+ ", cu frisca";
    }

    @Override
    public double getCost() {
        return super.getCost() + 2.0;
    }
}
