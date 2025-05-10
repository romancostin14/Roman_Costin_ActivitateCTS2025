package Decorator.v2_decorator.clase;

public class NotificareSMS extends NotificareDecorator{
    public NotificareSMS(Notificare notificare) {
        super(notificare);
    }

    @Override
    public void trimite(String mesaj) {
        super.trimite(mesaj);
        System.out.println("SMS trimis:" + mesaj);
    }
}
