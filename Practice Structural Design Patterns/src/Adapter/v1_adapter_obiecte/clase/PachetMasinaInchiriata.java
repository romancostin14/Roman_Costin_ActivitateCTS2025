package Adapter.v1_adapter_obiecte.clase;

import Adapter.v1_adapter_obiecte.InchiriereMasini.MasinaInchiriata;

public class PachetMasinaInchiriata implements PachetTuristic {
    private MasinaInchiriata masinaInchiriata;

    public PachetMasinaInchiriata(MasinaInchiriata masinaInchiriata) {
        this.masinaInchiriata = masinaInchiriata;
    }

    @Override
    public void descriere() {
        System.out.println(this.masinaInchiriata.toString());
    }

    @Override
    public void rezervaPachet() {
        this.masinaInchiriata.inchiriazaMasina();
    }
}
