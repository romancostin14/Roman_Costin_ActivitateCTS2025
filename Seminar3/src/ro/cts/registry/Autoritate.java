package ro.cts.registry;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Autoritate {
    private final String nume;
    private final String webSite;
    private final Map<String, Reglementare> map = new HashMap<>();
    private static Autoritate instance = null;



    private Autoritate(String nume, String webSite) {
        this.nume = nume;
        this.webSite = webSite;
    }
    public static Autoritate GetInstance(String nume, String webSite){
        if (instance == null)
        {
            instance = new Autoritate(nume, webSite);
        }
        return instance;
    }


    public Reglementare getReglementare(String model) {
        if(map.containsKey(model)) {
            return map.get(model);
        }
        else{
            map.put(model, new Reglementare(model, map.size()+1,new Date().toString()));
            return map.get(model);
        }
    }

    @Override
    public String toString() {
        return "Autoritate{" +
                "nume='" + nume + '\'' +
                ", webSite='" + webSite + '\'' +
                '}';
    }
}


