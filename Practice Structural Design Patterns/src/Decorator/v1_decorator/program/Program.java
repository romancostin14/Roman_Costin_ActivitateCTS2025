package Decorator.v1_decorator.program;

import Decorator.v1_decorator.clase.Coffee;
import Decorator.v1_decorator.clase.FriscaDecorator;
import Decorator.v1_decorator.clase.MilkDecorator;
import Decorator.v1_decorator.clase.SimpleCoffee;

public class Program {

    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " => " + coffee.getCost() + " lei");

        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " => " + coffee.getCost() + " lei");

        coffee = new FriscaDecorator(coffee);
        System.out.println(coffee.getDescription() + " => " + coffee.getCost() + " lei");

    }
}
