package nl.hu.bep.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EigenaarTest {
    Eigenaar e1;

    @BeforeEach
    void beforeEach() {
        e1 = new Eigenaar("Meneer", "Krabs");
    }

    /**
     * Constructor tests
     */

    @Test
    void newEigenaarVoornaamNullShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Eigenaar(null,"van den Kreeft"));
    }

    @Test
    void newEigenaarAchternaamNullShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Eigenaar("Octo",null));
    }

    @Test
    void newEigenaarVoornaamEmptyShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Eigenaar("", "van den Kreeft"));
    }

    @Test
    void newEigenaarAchternaamEmptyShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Eigenaar("Octo",""));
    }

    @Test
    void newEigenaarVoornaamBlankShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Eigenaar("  ","van den Kreeft"));
    }

    @Test
    void newEigenaarAchternaamBlankShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Eigenaar("Octo","  "));
    }

    @Test
    void newEigenaarCorrectShouldNotThrow() {
        assertDoesNotThrow( () -> new Eigenaar("Meneer", "Krabs"));
    }

    /**
     * setVoornaam tests
     */

    @Test
    void setVoornaam() {
        e1.setVoornaam("Spongebob");
        assertEquals("Spongebob", e1.getVoornaam());
    }

    @Test
    void setVoornaamNullShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> e1.setVoornaam(null));
    }

    @Test
    void setVoornaamEmptyShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> e1.setVoornaam(""));
    }

    @Test
    void setVoornaamBlankShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> e1.setVoornaam("  "));
    }

    @Test
    void setVoornaamCorrectShouldNotThrow() {
        assertDoesNotThrow( () -> e1.setVoornaam("Spongebob"));
    }

    /**
     * setAchternaam tests
     */

    @Test
    void setAchternaam() {
        e1.setAchternaam("Squarepants");
        assertEquals("Squarepants", e1.getAchternaam());
    }

    @Test
    void setAchternaamNullShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> e1.setAchternaam(null));
    }

    @Test
    void setAchternaamEmptyShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> e1.setAchternaam(""));
    }

    @Test
    void setAchternaamBlankShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> e1.setAchternaam("  "));
    }

    @Test
    void setAchternaamCorrectShouldNotThrow() {
        assertDoesNotThrow( () -> e1.setAchternaam("Squarepants"));
    }
}