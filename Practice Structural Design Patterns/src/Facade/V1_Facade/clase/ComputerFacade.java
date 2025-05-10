package Facade.V1_Facade.clase;

public class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void startComputer() {
        cpu.freeze();
        String bootData = hardDrive.read(0,1024);
        memory.load(0,bootData);
        cpu.execute();
    }
}
