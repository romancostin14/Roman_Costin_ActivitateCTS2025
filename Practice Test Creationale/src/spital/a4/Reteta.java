package spital.a4;

import java.util.HashMap;
import java.util.Map;

public class Reteta implements RetetaPrototype {
   private String denumire;
   private Map<String, Double> solutii;

   public Reteta(String denumire)
   {
       this.denumire = denumire;
       this.solutii = new HashMap<>();
   }

   public void adaugaSolutie( String numeSolutie, double cantitate)
   {
       solutii.put(numeSolutie, cantitate);
   }
   public void afiseaza()
   {
       System.out.println("Reteta: " + denumire);
      for(Map.Entry<String, Double> entry : solutii.entrySet())
       {
           System.out.println(" - "+entry.getKey() + ":" + entry.getValue() +" ml");
       }
   }

    @Override
    public RetetaPrototype clone() {

        Reteta copie = new Reteta(this.denumire + " (copie)");
        for (Map.Entry<String, Double> entry : this.solutii.entrySet()) {
            copie.adaugaSolutie(entry.getKey(), entry.getValue());
        }
        return copie;
    }
}
