import v1_eagerinitialization.AgentieEager;
import v3_lazyinitialization.Agentie;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AgentieEager eager = AgentieEager.getInstance("nume",223.5f,10);
        System.out.println(eager);
        Agentie agentie = Agentie.getInstanta("Christian tour",110.3f,20);
        System.out.println(agentie);
        }
    }
