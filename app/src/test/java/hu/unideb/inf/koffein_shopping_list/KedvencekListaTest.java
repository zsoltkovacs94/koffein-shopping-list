package hu.unideb.inf.koffein_shopping_list;

import junit.framework.TestCase;

import org.junit.jupiter.api.Test;

public class KedvencekListaTest extends TestCase {

    @Test
    public void testAdd() {
        KedvencekLista kedvencekLista = new KedvencekLista();
        assertTrue(kedvencekLista.size() == 0);
        kedvencekLista.add("tojás");
        assertTrue(kedvencekLista.size() == 1);
        assertEquals(kedvencekLista.at(0), "tojás");
    }

    @Test
    public void testRemove() {
        KedvencekLista kedvencekLista = new KedvencekLista();
        kedvencekLista.add("tojás");
        assertTrue(kedvencekLista.size() == 1);
        kedvencekLista.remove(kedvencekLista.at(0));
        assertTrue(kedvencekLista.size() == 0);
    }

    @Test
    public void testSize() {
        KedvencekLista kedvencekLista = new KedvencekLista();
        assertTrue(kedvencekLista.size() == 0);
        kedvencekLista.add("tojás");
        assertTrue(kedvencekLista.size() == 1);
        kedvencekLista.remove(kedvencekLista.at(0));
        assertTrue(kedvencekLista.size() == 0);
    }

    @Test
    public void testAt() {
        KedvencekLista kedvencekLista = new KedvencekLista();
        kedvencekLista.add("tojás");
        kedvencekLista.add("tej");
        assertEquals(kedvencekLista.at(0), "tojás");
        assertEquals(kedvencekLista.at(1), "tej");
    }

}
