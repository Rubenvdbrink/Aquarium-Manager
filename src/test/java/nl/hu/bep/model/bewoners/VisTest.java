package nl.hu.bep.model.bewoners;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VisTest {
    Vis v1;

    @BeforeEach
    void beforeEach() {
        v1 = new Vis("Corydora","rood", 2, false, false, false);
    }

    //note for self: don't test null on booleans because null boolean is always false;

    /**
     * Constructor tests
     */

    @Test
    void newVisSoortnaamNullShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Vis(null, "rood", 2, true, false, false));
    }

    @Test
    void newVisKleurnaamNullShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Vis("Corydora", null, 2, true, false, false));
    }

    @Test
    void newVisAantalZeroShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Vis("Corydora", "rood", 0, true, false, false));
    }

    @Test
    void newVisSoortnaamEmptyShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Vis("", "rood", 2, true, false, false));
    }

    @Test
    void newVisKleurnaamEmptyShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Vis("Corydora", "", 2, true, false, false));
    }

    @Test
    void newVisSoortnaamBlankShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Vis("  ", "rood", 2, true, false, false));
    }

    @Test
    void newVisKleurnaamBlankShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Vis("Corydora", "  ", 2, true, false, false));
    }

    @Test
    void newVisCorrectShouldNotThrow() {
        assertDoesNotThrow( () -> new Vis("Corydora","rood", 2, true, false, false));
    }

    /**
     * setSoortnaam tests
     */

    @Test
    void setSoortnaam() {
        v1.setSoortnaam("goudvis");
        assertEquals("goudvis", v1.getSoortnaam());
    }

    @Test
    void setSoortnaamNullShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> v1.setSoortnaam(null));
    }

    @Test
    void setSoortnaamEmptyShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> v1.setSoortnaam(""));
    }

    @Test
    void setSoortnaamBlankShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> v1.setSoortnaam("  "));
    }

    @Test
    void setSoortnaamCorrectShouldNotThrow() {
        assertDoesNotThrow( () -> v1.setSoortnaam("goudvis"));
    }

    /**
     * setKleurnaam tests
     */

    @Test
    void setKleurnaam() {
        v1.setKleurnaam("groen");
        assertEquals("groen", v1.getKleurnaam());
    }

    @Test
    void setKleurnaamNullShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> v1.setKleurnaam(null));
    }

    @Test
    void setKleurnaamEmptyShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> v1.setKleurnaam(""));
    }

    @Test
    void setKleurnaamBlankShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> v1.setKleurnaam("  "));
    }

    @Test
    void setKleurnaamCorrectShouldNotThrow() {
        assertDoesNotThrow( () -> v1.setKleurnaam("groen"));
    }

    /**
     * setAantal tests
     */

    @Test
    void setAantalZeroShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> v1.setAantal(0));
    }

    @Test
    void setAantalCorrectShouldNotThrow() {
        assertDoesNotThrow( () -> v1.setAantal(2));
    }

    /**
     * setGroepsdier tests
     */

    @Test
    void setGroepsdier() {
        v1.setGroepsDier(true);
        assertEquals(true, v1.isGroepsDier());
    }

    /**
     * setAlgEtend tests
     */

    @Test
    void setAlgEtend() {
        v1.setAlgEtend(true);
        assertEquals(true, v1.isAlgEtend());
    }

    /**
     * setVereistSpeciaalVisVoer tests
     */

    @Test
    void setVereistSpeciaalVisVoer() {
        v1.setVereistSpeciaalVisVoer(true);
        assertEquals(true, v1.isVereistSpeciaalVisVoer());
    }
}
