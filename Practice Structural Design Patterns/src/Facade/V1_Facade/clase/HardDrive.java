package Facade.V1_Facade.clase;

public class HardDrive {
    public String read(long lba, int size) {
        System.out.println("HardDrive: reading data");
        return "boot data";
    }
}
