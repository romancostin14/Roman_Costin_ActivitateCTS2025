package Facade.V2_Facade.clase;

public class CafetieraSmartFacade {
    private RezervorApa apa;
    private DozatorCafea cafea;
    private Incalzitor incalzitor;
    private Preparare preparare;

    public CafetieraSmartFacade() {
        apa = new RezervorApa();
        cafea = new DozatorCafea();
        incalzitor = new Incalzitor();
        preparare = new Preparare();
    }

    public void faCafea() {
        apa.verificaApa();
        cafea.punCafea();
        incalzitor.incalzeste();
        preparare.preparaCafea();
    }
}
