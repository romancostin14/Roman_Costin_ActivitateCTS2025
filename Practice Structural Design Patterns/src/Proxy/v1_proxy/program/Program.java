package Proxy.v1_proxy.program;

import Proxy.v1_proxy.clase.IRezervare;
import Proxy.v1_proxy.clase.ProxyNumeClient;
import Proxy.v1_proxy.clase.ProxyRezervare;
import Proxy.v1_proxy.clase.Rezervare;

public class Program {
    public static void main(String[] args) {
        IRezervare rezervare = new Rezervare();
        IRezervare proxy = new ProxyRezervare(rezervare);
        proxy.realizeazaRezervare("Pop Irina",2);
        proxy.realizeazaRezervare("Ioana",4);

        IRezervare proxyCompus = new ProxyNumeClient(proxy);
        proxyCompus.realizeazaRezervare("Pop Irina",2);
        proxyCompus.realizeazaRezervare("Pop ",5);
        proxyCompus.realizeazaRezervare("Pop Irina",5);
    }
}
