package spital.a2;

public class PersonalFactory {
    public IPersonal createPersonal(Personal tipPersonal) throws Exception {
        switch (tipPersonal){
            case Brancardier: return new Brancardier();
            case Asistent:return new Asistent();
            case Medic:return new Medic();
            default: throw new Exception("Nu este un tip valid!");
        }


    }
}





