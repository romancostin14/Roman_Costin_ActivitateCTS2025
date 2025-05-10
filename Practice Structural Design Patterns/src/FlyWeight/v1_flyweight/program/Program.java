package FlyWeight.v1_flyweight.program;

import FlyWeight.v1_flyweight.clase.FabricaDeForme;
import FlyWeight.v1_flyweight.clase.Forma;

public class Program {

    public static void main(String[] args) {
        String[] culori = {"rosu", "verde", "albastru"};

        for (int i = 0; i < 10; i++) {
            String culoare = culori[i % culori.length];
            Forma cerc = FabricaDeForme.getCerc(culoare);
            int x = (int)(Math.random() * 100);
            int y = (int)(Math.random() * 100);
            cerc.deseneaza(x, y);
        }
    }
}
