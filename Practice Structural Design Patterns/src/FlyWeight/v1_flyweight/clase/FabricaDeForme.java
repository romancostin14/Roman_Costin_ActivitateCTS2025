package FlyWeight.v1_flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class FabricaDeForme {
    private static final Map<String, Forma> forme = new HashMap<>();

    public static Forma getCerc(String culoare) {
        Forma forma = forme.get(culoare);
        if (forma == null) {
            forma = new Cerc(culoare);
            forme.put(culoare, forma);
            System.out.println("Creare cerc de culoare: " + culoare);
        }
        return forma;
    }
}