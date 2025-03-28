package program;

import clase.Factory;
import clase.FactoryCategoria1;
import clase.PachetCazare;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    PachetCazare obtineCazare(Factory fabrica)
    {
        return fabrica.crearePachetCazare();
    }
    public static void main(String[] args) {
      Factory fabricaAgentie = new FactoryCategoria1();
      PachetCazare cazare = fabricaAgentie.crearePachetCazare();
      cazare.descriere();
    }
}