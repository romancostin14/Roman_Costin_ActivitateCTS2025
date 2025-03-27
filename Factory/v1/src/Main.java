//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AgentieFactory agentieFactory = new AgentieFactory();
        PachetTuristic pachetTuristic = null;
        try {
            pachetTuristic = agentieFactory.createPachet(TipPachet.pachetCazare);
        } catch (Exception e) {
            e.printStackTrace();
        }

        pachetTuristic.descriere();
    }
}