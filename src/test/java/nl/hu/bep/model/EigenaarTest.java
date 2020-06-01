package nl.hu.bep.model;

import nl.hu.bep.model.aquarium.Aquarium;
import nl.hu.bep.model.personen.Eigenaar;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EigenaarTest {
    Eigenaar e1;
    AquariumManager aquaman;

    @BeforeEach
    void beforeEach() {
        aquaman = new AquariumManager("aquaman");
        e1 = new Eigenaar("AquaRuben","1234", "ruben", "van den Brink");
    }

    /**
     * Constructor tests
     */

    @Test
    void newEigenaarVoornaamNullShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Eigenaar("AquaRuben","1234",null,"van den Kreeft"));
    }

    @Test
    void newEigenaarAchternaamNullShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Eigenaar("AquaRuben","1234","Octo",null));
    }

    @Test
    void newEigenaarVoornaamEmptyShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Eigenaar("AquaRuben","1234","", "van den Kreeft"));
    }

    @Test
    void newEigenaarAchternaamEmptyShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Eigenaar("AquaRuben","1234","Octo",""));
    }

    @Test
    void newEigenaarVoornaamBlankShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Eigenaar("AquaRuben","1234","  ","van den Kreeft"));
    }

    @Test
    void newEigenaarAchternaamBlankShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Eigenaar("AquaRuben","1234","Octo","  "));
    }

    @Test
    void newEigenaarCorrectShouldNotThrow() {
        assertDoesNotThrow( () -> new Eigenaar("AquaRuben","1234","Meneer", "Krabs"));
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

    /**
     * getAquariumByName tests
     */

    @Test
    void getAquariumByNameShouldBeEqual() {
        Aquarium a1 = new Aquarium("aquawater", 2, 2, 2, "WA", "wad");
        e1.addAquarium(a1);
        Aquarium a2 = e1.getAquariumByName("aquawater");
        assertEquals(a1, a2);
    }

    @Test
    void getAquariumByNameShouldBeNotEqual() {
        Aquarium a1 = new Aquarium("aquawater", 2, 2, 2, "WA", "wad");
        e1.addAquarium(a1);
        Aquarium a2 = e1.getAquariumByName("aquawateryeet");
        assertNotEquals(a1,a2);
    }

    /**
     * addAquarium tests
     */

    @Test
    void addAquariumShouldBeTrue() {
        Aquarium a1 = new Aquarium("aquawater", 2, 2, 2, "WA", "wad");
        assertTrue(e1.addAquarium(a1));
    }

    @Test
    void addAquariumAlreadyExistsInEigenAquariaShouldBeFalse() {
        Aquarium a1 = new Aquarium("aquawater", 2, 2, 2, "WA", "wad");
        e1.addAquarium(a1);
        assertFalse(e1.addAquarium(a1));
    }
}