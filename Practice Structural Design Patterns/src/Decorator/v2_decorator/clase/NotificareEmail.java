package Decorator.v2_decorator.clase;

public class NotificareEmail implements Notificare {
    @Override
    public void trimite(String mesaj) {
        System.out.println("Email trimis:" + mesaj);
    }
}
