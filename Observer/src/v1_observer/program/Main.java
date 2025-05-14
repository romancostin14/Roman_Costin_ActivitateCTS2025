package v1_observer.program;


import v1_observer.clase.Autobuz;
import v1_observer.clase.Calator;
import v1_observer.clase.MijlocTransport;
import v1_observer.clase.Observer;

public class Main {
    public static void main(String[] args) {
        Observer calator1 = new Calator("calator1");
        Observer calator2 = new Calator("calator2");
        Observer calator3 = new Calator("calator3");

        MijlocTransport autobuz = new Autobuz(335);
        autobuz.adaugaObserver(calator1);
        autobuz.adaugaObserver(calator2);
        autobuz.adaugaObserver(calator3);
        autobuz.pleacaDeLaCapat();
        autobuz.stergeObserver(calator2);
        ((Autobuz)autobuz).schimbaTraseul();
        }
    }
