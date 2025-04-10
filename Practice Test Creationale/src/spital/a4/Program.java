package spital.a4;

public class Program {
    public static void main(String[] args) {
        Reteta retetaOriginala = new Reteta("Reteta Antibiotic");
        retetaOriginala.adaugaSolutie("Penicilina", 100.0);
        retetaOriginala.adaugaSolutie("Apa distilata", 50.0);

        retetaOriginala.afiseaza();

        Reteta retetaClonata = (Reteta) retetaOriginala.clone();
        System.out.println("\n === Reteta clonata ==");
        retetaClonata.afiseaza();
    }
}
