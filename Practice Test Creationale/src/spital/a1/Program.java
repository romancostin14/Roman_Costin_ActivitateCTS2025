package spital.a1;

public class Program {
    public static void main(String[] args) {
        Pacient p1 = new PacientBuilder("Petrache Ionescu").setHasPatRabatabil().setHasPapuciCamera().build();
        System.out.println(p1);
    }
}
