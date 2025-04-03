package agentie.program;

import agentie.clase.Facade;

public class Program {

    public static void main(String[] args) {
        Facade facade=new Facade();
        facade.rezervaPachetCazareTransport("Barcelona","Otopeni");
    }
}
