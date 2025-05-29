package teste;

import Exceptii.ExceptieCNPInexistent;
import Exceptii.ExceptieCNPInvalid;
import clase.Persoana;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class GetVarstaTest {
    private Persoana persoana;
    private Persoana persoana2;
    @org.junit.Before
    public void setUp() throws Exception {
        persoana = new Persoana();
        persoana2 = new Persoana();
    }

    @org.junit.Test
    public void getVarstaRight() {
        persoana = new Persoana("Ion","1921126781234");
        assertEquals(32,persoana.getVarsta());
    }


    @org.junit.Test
    public void getVarstaRight2() {
        persoana = new Persoana("Ion","5021126781234");
        assertEquals(22,persoana.getVarsta());
    }


    @org.junit.Test
    public void getVarstaBoundary() {
        persoana = new Persoana("Ion","1991231781234");
        assertEquals(25,persoana.getVarsta());
    }

    @org.junit.Test
    public void getVarstaBoundary2() {
        persoana = new Persoana("Ion","5000101781234");
        assertEquals(25,persoana.getVarsta());
    }


    @org.junit.Test(expected = ExceptieCNPInvalid.class)
    public void getVarstaEroare1() {
        persoana = new Persoana("Ion","5b00101781234");
        persoana.getVarsta();

    }

    @org.junit.Test(expected = ExceptieCNPInvalid.class)
    public void getVarstaEroare2() {
        persoana = new Persoana("Ion","5000141781234");
        persoana.getVarsta();

    }

    @Test(timeout = 100)
    public void getVarstaPerfomance() {
        persoana = new Persoana("Andrei","5001201781234");
        persoana.getVarsta();
    }

    @Test
    public void getVarstaOrder()
    {
        persoana = new Persoana("Ion","1991231781234");
        persoana2 = new Persoana("Cristian","5021126781234");
        assertTrue("Ion " +persoana.getVarsta() +" este mai mare decat Cristian "+persoana2.getVarsta(),persoana.getVarsta()>persoana2.getVarsta());
    }

    @Test(expected = ExceptieCNPInexistent.class)
    public void getVarstaExist(){
        persoana = new Persoana("Ion",null);
        persoana.getVarsta();
    }
    @Test
    public void getVarstaCardinality0(){
        persoana = new Persoana("Ion","625010156732");
        assertEquals(0,persoana.getVarsta());
    }

    @Test
    public void getVarstaCardinality1(){
        persoana = new Persoana("Ion","524010156732");
        assertEquals(1,persoana.getVarsta());
    }

}