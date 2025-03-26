package V8_registry_of_singletons;

import com.sun.jdi.connect.Transport;

public class PachetTransport implements PachetTuristic{

    @Override
    public void descriere() {
        System.out.println("Acest pachet include doar transport");
    }
}
