package ro.cts.main;

import ro.cts.clase.AutoritateReglementareMasiniEager;
import ro.cts.clase.AutoritateReglementareMasiniLazy;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    AutoritateReglementareMasiniEager autoritate = AutoritateReglementareMasiniEager.getInstance();
    System.out.println(autoritate);

    AutoritateReglementareMasiniEager autoritate2 = AutoritateReglementareMasiniEager.getInstance();
    autoritate2.setWebSite("https://www.siteNou.com");
    System.out.println(autoritate2);
    autoritate2.reglementeazaModel("Dacia Logan");
    System.out.println(autoritate2);

    AutoritateReglementareMasiniLazy autoritate3 = AutoritateReglementareMasiniLazy.getInstance("Autoritate Test","www.autoritateTest.ro",200);
    System.out.println(autoritate3);

        }
    }
