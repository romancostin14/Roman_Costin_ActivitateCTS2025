package Adapter.v1_adapter_obiecte.program;


import Adapter.v1_adapter_obiecte.InchiriereMasini.Masina;
import Adapter.v1_adapter_obiecte.InchiriereMasini.MasinaInchiriata;
import Adapter.v1_adapter_obiecte.clase.PachetMasinaInchiriata;
import Adapter.v1_adapter_obiecte.clase.PachetTuristic;

public class Main {
    public static void main(String[] args) {
        Masina masina = new Masina("Renault", 1400);
        MasinaInchiriata masinaInchiriata = new MasinaInchiriata(masina);
        PachetTuristic pachetMasinaInchiriata = new PachetMasinaInchiriata(masinaInchiriata);
        pachetMasinaInchiriata.rezervaPachet();
        pachetMasinaInchiriata.descriere();
        }
    }