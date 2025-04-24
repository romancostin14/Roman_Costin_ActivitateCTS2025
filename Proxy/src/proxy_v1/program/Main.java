package proxy_v1.program;

import proxy_v1.clase.IRezervare;
import proxy_v1.clase.ProxyNumeClient;
import proxy_v1.clase.ProxyRezervare;
import proxy_v1.clase.Rezervare;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
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