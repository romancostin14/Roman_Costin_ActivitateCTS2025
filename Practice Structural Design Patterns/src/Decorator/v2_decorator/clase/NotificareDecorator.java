package Decorator.v2_decorator.clase;

abstract class NotificareDecorator implements Notificare {
    protected Notificare notificare;
    public NotificareDecorator(Notificare notificare) {
        this.notificare = notificare;
    }

    @Override
    public void trimite(String mesaj) {
        notificare.trimite(mesaj);
    }
}
