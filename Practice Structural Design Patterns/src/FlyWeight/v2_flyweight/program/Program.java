package FlyWeight.v2_flyweight.program;

import FlyWeight.v2_flyweight.clase.Caracter;
import FlyWeight.v2_flyweight.clase.CaracterFactory;

public class Program {

        public static void main(String[] args) {
            Caracter c1 = CaracterFactory.getCaracter('a', "Arial");
            Caracter c2 = CaracterFactory.getCaracter('b', "Arial");
            Caracter c3 = CaracterFactory.getCaracter('a', "Arial"); // nu se va crea din nou

            c1.afiseaza(1, 1);
            c2.afiseaza(1, 2);
            c3.afiseaza(1, 3); // folosește instanța existentă
        }

}
