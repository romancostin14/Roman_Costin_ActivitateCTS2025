package spital.a2;

public class Program {
    public static void main(String[] args) throws Exception {
        PersonalFactory factory = new PersonalFactory();
        try {
            IPersonal personal = factory.createPersonal(Personal.Asistent);
            personal.afiseazaDescriere();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
