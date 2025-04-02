package factory.clase;

public interface AbstractFactory {
    FelDeMancare creareFelDeMancare(Enum tipFelDeMancare, float pret, float calorii);
}
