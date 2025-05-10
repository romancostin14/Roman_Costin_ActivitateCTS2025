package Decorator.v1_decorator.clase;

public class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+ ", cu lapte";
    }

    @Override
    public double getCost() {
        return super.getCost()+1.5;
    }
}
