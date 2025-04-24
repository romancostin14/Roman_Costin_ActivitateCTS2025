package facade_v2.clase;

public class VerificatorDisponibilitate {
    public boolean esteLibera(int masaId)
    {
        if(masaId%2==0)
            return true;
        else return false;

    }
}
