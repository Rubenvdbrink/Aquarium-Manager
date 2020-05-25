package nl.hu.bep.model.aquarium;

import nl.hu.bep.model.Eigenaar;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VerlichtingTest {
    Verlichting v1;

    @BeforeEach
    void beforeEach() {
        v1 = new Verlichting("3x",999, false, 5, 3);
    }

    /**
     * Constructor tests
     */

    @Test
    void newVerlichtingModelNullShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Verlichting(null,999, false, 5, 3));
    }

    @Test
    void newVerlichtingModelEmptyShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Verlichting("",999, false, 5, 3));
    }

    @Test
    void newVerlichtingModelBlankShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Verlichting("  ",999, false, 5, 3));
    }

    @Test
    void newVerlichtingSerienummerZeroShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Verlichting("3x",0, false, 5, 3));
    }

    @Test
    void newVerlichtingTijdAanZeroShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Verlichting("3x",999, false, 0, 3));
    }

    @Test
    void newVerlichtingTijdUitZeroShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Verlichting("3x",999, false, 5, 0));
    }

    @Test
    void newVerlichtingCorrectShouldNotThrow() {
        assertDoesNotThrow( () -> new Verlichting("3x",999, false, 5, 3));
    }

    /**
     * setModel tests
     */

    @Test
    void setModel() {
        v1.setModel("500X");
        assertEquals("500X", v1.getModel());
    }

    @Test
    void setModelNullShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> v1.setModel(null));
    }

    @Test
    void setModelEmptyShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> v1.setModel(""));
    }

    @Test
    void setModelBlankShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> v1.setModel("  "));
    }

    @Test
    void setModelCorrectShouldNotThrow() {
        assertDoesNotThrow( () -> v1.setModel("500X"));
    }

    /**
     * setSerienummer tests
     */

    @Test
    void setSerienummer() {
        v1.setSerienummer(77);
        assertEquals(77, v1.getSerienummer());
    }

    @Test
    void setSerienummerZeroShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> v1.setSerienummer(0));
    }

    @Test
    void setSerienummerCorrectShouldNotThrow() {
        assertDoesNotThrow( () -> v1.setSerienummer(77));
    }

    /**
     * setTijdAan tests
     */

    @Test
    void setTijdAan() {
        v1.setTijdAan(77);
        assertEquals(77, v1.getTijdAan());
    }

    @Test
    void setTijdAanZeroShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> v1.setTijdAan(0));
    }

    @Test
    void setTijdAanCorrectShouldNotThrow() {
        assertDoesNotThrow( () -> v1.setTijdAan(77));
    }

    /**
     * setTijdUit tests
     */

    @Test
    void setTijdUit() {
        v1.setTijdUit(77);
        assertEquals(77, v1.getTijdUit());
    }

    @Test
    void setTijdUitZeroShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> v1.setTijdUit(0));
    }

    @Test
    void setTijdUitCorrectShouldNotThrow() {
        assertDoesNotThrow( () -> v1.setTijdUit(77));
    }

    /**
     * setLed tests
     */

    @Test
    void setLed() {
        v1.setLed(true);
        assertEquals(true, v1.isLed());
    }
}