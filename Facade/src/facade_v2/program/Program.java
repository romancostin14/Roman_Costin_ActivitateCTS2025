package facade_v2.program;

import facade_v2.clase.ManagerMeseFacade;



public class Program {

    public static void verificaMasaPregatita(ManagerMeseFacade facade, int masaId){
        if(facade.esteMasaPregatita(masaId)){
            System.out.println("Masa "+ masaId+" este pregatita");
        }else {
            System.out.println("Masa "+ masaId+" NU este pregatita");
        }
    }
    public static void main(String[] args) {
        ManagerMeseFacade facade = new ManagerMeseFacade();
        int masaId=3;
        Program.verificaMasaPregatita(facade, 3);
        Program.verificaMasaPregatita(facade, 2);
        Program.verificaMasaPregatita(facade, 4);


    }
}
