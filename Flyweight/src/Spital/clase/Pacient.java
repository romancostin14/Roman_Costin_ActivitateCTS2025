package Spital.clase;

public class Pacient implements IPacient {
    private String numePacient;
    private String numarTelefon;
    private String adresaEmail;

    public Pacient(String numePacient, String numarTelefon, String adresaEmail) {
        this.numePacient = numePacient;
        this.numarTelefon = numarTelefon;
        this.adresaEmail = adresaEmail;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "numePacient='" + numePacient + '\'' +
                ", numarTelefon='" + numarTelefon + '\'' +
                ", adresaEmail='" + adresaEmail + '\'' +
                '}';
    }

    @Override
    public void descrierePaient(Spitalizare spitalizare) {
        System.out.println("Pacientul cu numele" + numePacient + " cu numarul de telefon " + numarTelefon  + " cu adresa de Email " + adresaEmail);
        System.out.println(spitalizare.toString());
    }
}
