package v1_strategy.Clase;

public class CardCalatorie implements IMetodaPlata {
    int nrCalatoriiRamase;

    public CardCalatorie(int nrCalatoriiRamase) {
        this.nrCalatoriiRamase = nrCalatoriiRamase;
    }


    @Override
    public void plateste() {
            if(nrCalatoriiRamase>0)
            {
                System.out.println("Ai platit cu cardul de calatorii");
                nrCalatoriiRamase--;
            }
            else{
                System.out.println("Nu mai ai calatorii ramase");
            }
    }
}
