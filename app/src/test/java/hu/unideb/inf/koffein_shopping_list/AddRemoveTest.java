package hu.unideb.inf.koffein_shopping_list;

import junit.framework.TestCase;

import org.junit.jupiter.api.Test;

public class AddRemoveTest extends TestCase {

    @Test
    public void testAddTermek() {
        TermekLista termekLista = new TermekLista();
        termekLista.add("Alma,5,db");
        assertEquals(1, termekLista.size());
    }

    @Test
    public void testRemoveTermek() {
        TermekLista termekLista = new TermekLista();
        termekLista.add("Alma,5,db");
        termekLista.remove(termekLista.at(0));
        assertEquals(0, termekLista.size());
    }
}