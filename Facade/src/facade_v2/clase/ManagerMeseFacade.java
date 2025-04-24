package facade_v2.clase;

public class ManagerMeseFacade {
    private VerificatorDebarasare verificatorDebarasare;
    private VerificatorDisponibilitate verificatorDisponibilitate;
    private VerificatorServetele verificatorServetele;

    public ManagerMeseFacade() {

        this.verificatorDebarasare = new VerificatorDebarasare();
        this.verificatorDisponibilitate = new VerificatorDisponibilitate();
        this.verificatorServetele = new VerificatorServetele();
    }

    public boolean esteMasaPregatita(int masaId)
    {
        return verificatorDisponibilitate.esteLibera(masaId)&&verificatorDebarasare.esteDebarasata(masaId)
                &&verificatorServetele.areServetele(masaId);
    }
}
