package Decorator.v2_decorator.clase;

public class NotificarePush extends NotificareDecorator{
    public NotificarePush(Notificare notificare) {
        super(notificare);
    }

    @Override
    public void trimite(String mesaj) {
        super.trimite(mesaj);
        System.out.println("Notificare push trimisa:" + mesaj);
    }
}
