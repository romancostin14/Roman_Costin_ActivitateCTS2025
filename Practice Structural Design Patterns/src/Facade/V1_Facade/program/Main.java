package Facade.V1_Facade.program;

import Facade.V1_Facade.clase.ComputerFacade;

public class Main {
    public static void main(String[] args) {
        ComputerFacade computerFacade = new ComputerFacade();
        computerFacade.startComputer();
    }
}
