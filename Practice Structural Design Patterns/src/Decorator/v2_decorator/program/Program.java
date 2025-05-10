package Decorator.v2_decorator.program;

import Decorator.v2_decorator.clase.Notificare;
import Decorator.v2_decorator.clase.NotificareEmail;
import Decorator.v2_decorator.clase.NotificarePush;
import Decorator.v2_decorator.clase.NotificareSMS;

public class Program {
    public static void main(String[] args) {
        Notificare notificare = new NotificareEmail();
        notificare = new NotificarePush(notificare);
        notificare = new NotificareSMS(notificare);
        notificare.trimite("Acesta este un test!!");
    }
}
