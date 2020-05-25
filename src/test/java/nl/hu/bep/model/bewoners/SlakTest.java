package nl.hu.bep.model.bewoners;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SlakTest {
    /**
     * Methods from superclass already testen in VisTest
     */

    /**
     * setSlakkenetend test
     */

    @Test
    void setSlakkenEtend() {
        Slak s1 = new Slak("zeeslak", "rood", 5, true, false);
        s1.setSlakkenEtend(true);
        assertEquals(true, s1.isSlakkenEtend());
    }
}