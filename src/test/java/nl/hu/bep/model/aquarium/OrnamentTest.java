package nl.hu.bep.model.aquarium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrnamentTest {
    Ornament o1;

    @BeforeEach
    void beforeEach() { o1 = new Ornament("Spongebobs Home", "Pineapple", "Yellow", false); }

    /**
     * Constructor tests
     */

    @Test
    void newOrnamentNaamNullShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Ornament(null, "Pineapple", "Yellow", false));
    }

    @Test
    void newOrnamentOmschrijvingNullShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Ornament("Spongebobs Home", null, "Yellow", false));
    }

    @Test
    void newOrnamentKleurNullShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Ornament("Spongebobs Home", "Pineapple", null, false));
    }

    @Test
    void newOrnamentNaamEmptyShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Ornament("", "Pineapple", "Yellow", false));
    }

    @Test
    void newOrnamentOmschrijvingEmptyShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Ornament("Spongebobs Home", "", "Yellow", false));
    }

    @Test
    void newOrnamentKleurEmptyShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Ornament("Spongebobs Home", "Pineapple", "", false));
    }

    @Test
    void newOrnamentNaamBlankShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Ornament("  ", "Pineapple", "Yellow", false));
    }

    @Test
    void newOrnamentOmschrijvingBlankShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Ornament("Spongebobs Home", "  ", "Yellow", false));
    }

    @Test
    void newOrnamentKleurBlankShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Ornament("Spongebobs Home", "Pineapple", "  ", false));
    }

    @Test
    void newOrnamentCorrectShouldNotThrow() {
        assertDoesNotThrow( () -> new Ornament("Spongebobs Home", "Pineapple", "Yellow", false));
    }

    /**
     * setNaam tests
     */

    @Test
    void setNaam() {
        o1.setNaam("Octo's Home");
        assertEquals("Octo's Home", o1.getNaam());
    }

    @Test
    void setNaamNullShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> o1.setNaam(null));
    }

    @Test
    void setNaamEmptyShouldThrow() { assertThrows(IllegalArgumentException.class, () -> o1.setNaam("")); }

    @Test
    void setNaamBlankShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> o1.setNaam("  "));
    }

    @Test
    void setNaamCorrectShouldNotThrow() {
        assertDoesNotThrow( () -> o1.setNaam("Octo's Home"));
    }

    /**
     * setOmschrijving tests
     */

    @Test
    void setOmschrijving() {
        o1.setOmschrijving("Long home");
        assertEquals("Long home", o1.getOmschrijving());
    }

    @Test
    void setOmschrijvingNullShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> o1.setOmschrijving(null));
    }

    @Test
    void setOmschrijvingmptyShouldThrow() { assertThrows(IllegalArgumentException.class, () -> o1.setOmschrijving("")); }

    @Test
    void setOmschrijvingBlankShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> o1.setOmschrijving("  "));
    }

    @Test
    void setOmschrijvingCorrectShouldNotThrow() {
        assertDoesNotThrow( () -> o1.setOmschrijving("Long home"));
    }

    /**
     * setKleur tests
     */

    @Test
    void setKleur() {
        o1.setKleur("Grey");
        assertEquals("Grey", o1.getKleur());
    }

    @Test
    void setKleurNullShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> o1.setKleur(null));
    }

    @Test
    void setKleurEmptyShouldThrow() { assertThrows(IllegalArgumentException.class, () -> o1.setKleur("")); }

    @Test
    void setKleurBlankShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> o1.setKleur("  "));
    }

    @Test
    void setKleurCorrectShouldNotThrow() {
        assertDoesNotThrow( () -> o1.setKleur("Grey"));
    }

    /**
     * kanOpLuchtPomp tests
     */

    @Test
    void setKanOpLuchtPomp() {
        o1.setKanOpLuchtpomp(true);
        assertEquals(true, o1.isKanOpLuchtpomp());
    }
}
