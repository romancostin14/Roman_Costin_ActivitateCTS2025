package facade_v3;

import facade_v3.clase.Masa;

public class Program {

    public static void main(String[] args) {
        Masa masa = new Masa(4,true);
        Facade facade = new Facade();
        System.out.println(facade.VerificaAsezareMasa(masa));


        Masa masa2 = new Masa(7,true);
        System.out.println(facade.VerificaAsezareMasa(masa2));

        Masa masa3 = new Masa(5,false);
        System.out.println(facade.VerificaAsezareMasa(masa3));
    }
}
