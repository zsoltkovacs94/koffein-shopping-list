package hu.unideb.inf.koffein_shopping_list;

import junit.framework.TestCase;

import org.junit.Test;


public class TermekTest extends TestCase {
    @Test
    public void testGetTermekNev() {
        Termek t = new Termek("sajt,1,kg");
        Termek t2 = new Termek("sajt,1,kg");
        assertEquals(t.getTermekNev(),"sajt");
        assertEquals(t.getTermekNev(),t2.getTermekNev());
    }
    @Test
    public void testGetMennyiseg() {
        Termek t = new Termek("sajt,1,kg");
        Termek t2 = new Termek("sajt,1,kg");
        assertEquals(t.getMennyiseg(),"1");
        assertEquals(t.getMennyiseg(),t2.getMennyiseg());
    }
    @Test
    public void testGetMertekegyseg() {
        Termek t = new Termek("sajt,1,kg");
        Termek t2 = new Termek("sajt,1,kg");
        assertEquals(t.getMertekegyseg(),"kg");
        assertEquals(t.getMertekegyseg(),t2.getMertekegyseg());
    }
    @Test
    public void testTestToString() {
        Termek t = new Termek("sajt,1,kg");
        Termek t2 = new Termek("sajt,1,kg");
        assertEquals(t.toString(),"sajt,1,kg");
        assertEquals(t.toString(),t2.toString());
    }
}