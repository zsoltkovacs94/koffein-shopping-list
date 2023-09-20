package hu.unideb.inf.koffein_shopping_list;

import junit.framework.TestCase;

import org.junit.jupiter.api.Test;

public class TermekListaTest extends TestCase {
    @Test
    public void testAdd() {
        TermekLista termekLista = new TermekLista();
        assertTrue(termekLista.size()==0);
        termekLista.add("sajt,1,kg");
        assertTrue(termekLista.size()==1);
        assertEquals(termekLista.at(0).toString(),"sajt,1,kg");
    }
    @Test
    public void testRemove() {
        TermekLista termekLista = new TermekLista();
        termekLista.add("sajt,1,kg");
        assertTrue(termekLista.size()==1);
        termekLista.remove(termekLista.at(0));
        assertTrue(termekLista.size()==0);
    }
    @Test
    public void testSize() {
        TermekLista termekLista = new TermekLista();
        assertTrue(termekLista.size()==0);
        termekLista.add("sajt,1,kg");
        assertTrue(termekLista.size()==1);
        termekLista.remove(termekLista.at(0));
        assertTrue(termekLista.size()==0);
    }
    @Test
    public void testAt() {
        TermekLista termekLista = new TermekLista();
        termekLista.add("sajt,1,kg");
        termekLista.add("alma,2,dkg");
        assertEquals(termekLista.at(0).toString(),"sajt,1,kg");
        assertEquals(termekLista.at(1).toString(),"alma,2,dkg");
    }
}