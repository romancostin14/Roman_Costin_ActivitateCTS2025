package v1_strategy.Clase;

public class Validator {
    private IMetodaPlata metodaPlata;

    public void setModPlata(IMetodaPlata metodaPlata) {
        this.metodaPlata = metodaPlata;
    }

    public void valideazaCalatorie() {
        metodaPlata.plateste();
    }
}
