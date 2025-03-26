package v2_staticblock;

public class AgentieStaticBlock {
    private String numeAgentie;
    private float capital;
    private int numarAngajati;

    private static AgentieStaticBlock instance;


    static{
        try{
            instance = new AgentieStaticBlock();
        }
        catch(Exception e){
            System.out.println("Agentia nu poate fi creata.");
        }
    }

    private AgentieStaticBlock(){
        this.numeAgentie="AgeTur";
        this.capital=1000;
        this.numarAngajati=5;
    }

    public String getNumeAgentie() {
        return numeAgentie;
    }

    public float getCapital() {
        return capital;
    }

    public int getNumarAngajati() {
        return numarAngajati;
    }

    public void setNumeAgentie(String numeAgentie) {
        this.numeAgentie = numeAgentie;
    }

    public void setCapital(float capital) {
        this.capital = capital;
    }

    public void setNumarAngajati(int numarAngajati) {
        this.numarAngajati = numarAngajati;
    }

    public static AgentieStaticBlock getInstance(String nume, float capital, int numarAngajati) {
        return instance;
    }


}
