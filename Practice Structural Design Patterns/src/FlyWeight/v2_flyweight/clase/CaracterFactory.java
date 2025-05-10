package FlyWeight.v2_flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class CaracterFactory {
    private static Map<String, Caracter> caractere = new HashMap<>();

    public static Caracter getCaracter(char simbol, String font) {
        String cheie = simbol + font;
        if (!caractere.containsKey(cheie)) {
            caractere.put(cheie, new CaracterConcret(simbol, font));
            System.out.println("Creat caracter: " + simbol + " cu font " + font);
        }
        return caractere.get(cheie);
    }
}
