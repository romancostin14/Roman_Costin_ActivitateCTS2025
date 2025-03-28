//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Program {

    private static void afisare(Factory fabrica){
        PachetTuristic pachetTuristic = fabrica.createPachet();
        pachetTuristic.descriere();
    }
    public static void main(String[] args) {
        afisare(new FactoryPachetCazare());
        afisare(new FactoryPachetAllInclusive());

    }
}