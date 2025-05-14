package v1_strategy.Program;

import v1_strategy.Clase.CardBancar;
import v1_strategy.Clase.CardCalatorie;
import v1_strategy.Clase.PlataSMS;
import v1_strategy.Clase.Validator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Validator validator = new Validator();

        validator.setModPlata(new CardCalatorie(5));
        validator.valideazaCalatorie();

        validator.setModPlata(new CardBancar());
        validator.valideazaCalatorie();

        validator.setModPlata(new PlataSMS());
        validator.valideazaCalatorie();
        }
    }
