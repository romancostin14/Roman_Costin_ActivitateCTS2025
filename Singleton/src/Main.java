import v1_eagerinitialization.AgentieEager;
import v3_lazyinitialization.AgentieLazy;
import v4_threadsafe.AgentieThreadSafe;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AgentieEager agentie = AgentieEager.getInstance();
        System.out.println(agentie);

        agentie.setCapital(1500);
        agentie.setNumeAgentie("HappyTrips");
        agentie.setNumarAngajati(8);
        System.out.println(agentie);

        // Prima apelare - se creează instanța
        AgentieLazy agentie1 = AgentieLazy.getInstanta("AgeTur", 1500f, 10);
        System.out.println("Prima instanță:");
        System.out.println("Nume: " + agentie1.getNumeAgentie());
        System.out.println("Capital: " + agentie1.getCapital());
        System.out.println("Număr angajați: " + agentie1.getNumarAngajati());

        System.out.println();

        // A doua apelare - se returnează aceeași instanță, se ignoră noii parametri
        AgentieLazy agentie2 = AgentieLazy.getInstanta("AltaAgentie", 9999f, 50);
        System.out.println("A doua instanță:");
        System.out.println("Nume: " + agentie2.getNumeAgentie());
        System.out.println("Capital: " + agentie2.getCapital());
        System.out.println("Număr angajați: " + agentie2.getNumarAngajati());

        System.out.println();

        // Verificare că ambele sunt aceeași instanță
        if (agentie1 == agentie2) {
            System.out.println("Cele două instanțe sunt identice (singleton).");
        } else {
            System.out.println("Instanțele sunt diferite!");
        }


        AgentieThreadSafe agentie3 = AgentieThreadSafe.getInstanta("InfoTour",284.4f,20);
        System.out.println(agentie3);
        }
    }
