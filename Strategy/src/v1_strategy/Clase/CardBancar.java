package v1_strategy.Clase;

public class CardBancar implements IMetodaPlata{

    float sold;


    @Override
    public void plateste() {
        if(sold>0)
        {
            System.out.println("Ai platit cu cardul bancar");
            sold=sold-5;
        }
        else
            {
            System.out.println("Fonduri insuficiente pe cont bancar");
        }
    }
}
