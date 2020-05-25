package nl.hu.bep.model.aquarium;

import nl.hu.bep.model.Eigenaar;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AquariumTest {
    Aquarium a1;

    @BeforeEach
    void beforeEach() {
        a1 = new Aquarium("Bikini Bottom", 100, 100, 50, "zand", "zout");
    }

    /**
     * Constructor tests
     */

    @Test
    void newAquariumNaamNullShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Aquarium(null, 100, 100, 50, "zand", "zout"));
    }

    @Test
    void newAquariumBodemsoortNullShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Aquarium("Bikini Bottom", 100, 100, 50, null, "zout"));
    }

    @Test
    void newAquariumWatersoortNullShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Aquarium("Bikini Bottom", 100, 100, 50, "zand", null));
    }

    @Test
    void newAquariumLengteZeroShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Aquarium("Bikini Bottom", 0, 100, 50, "zand", "zout"));
    }

    @Test
    void newAquariumBreedteZeroShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Aquarium("Bikini Bottom", 100, 0, 50, "zand", "zout"));
    }

    @Test
    void newAquariumHoogteZeroShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Aquarium("Bikini Bottom", 100, 100, 0, "zand", "zout"));
    }

    @Test
    void newAquariumNaamEmptyShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Aquarium("", 100, 100, 50, "zand", "zout"));
    }

    @Test
    void newAquariumBodemsoortEmptyShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Aquarium("Bikini Bottom", 100, 100, 50, "", "zout"));
    }

    @Test
    void newAquariumWatersoortEmptyShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Aquarium("Bikini Bottom", 100, 100, 50, "zand", ""));
    }

    @Test
    void newAquariumNaamBlankShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Aquarium("  ", 100, 100, 50, "zand", "zout"));
    }

    @Test
    void newAquariumBodemsoortBlankShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Aquarium("Bikini Bottom", 100, 100, 50, "  ", "zout"));
    }

    @Test
    void newAquariumWatersoortBlankShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Aquarium("Bikini Bottom", 100, 100, 50, "zand", "  "));
    }

    @Test
    void newAquariumCorrectShouldNotThrow() {
        assertDoesNotThrow( () -> new Aquarium("Bikini Bottom", 100, 100, 50, "zand", "zout"));
    }

    /**
     * setNaam tests
     */

    @Test
    void setNaam() {
        a1.setNaam("Crusty Crab");
        assertEquals("Crusty Crab", a1.getNaam());
    }

    @Test
    void setNaamNullShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> a1.setNaam(null));
    }

    @Test
    void setNaamEmptyShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> a1.setNaam(""));
    }

    @Test
    void setNaamBlankShouldThrow() { assertThrows(IllegalArgumentException.class, () -> a1.setNaam("  ")); }

    @Test
    void setNaamCorrectShouldNotThrow() {
        assertDoesNotThrow( () -> a1.setNaam("Crusty Crab"));
    }

    /**
     * setBodemsoort tests
     */

    @Test
    void setBodemsoort() {
        a1.setBodemsoort("kiezelstenen");
        assertEquals("kiezelstenen", a1.getBodemsoort());
    }

    @Test
    void setBodemsoortNullShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> a1.setBodemsoort(null));
    }

    @Test
    void setBodemsoortEmptyShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> a1.setBodemsoort(""));
    }

    @Test
    void setBodemsoortBlankShouldThrow() { assertThrows(IllegalArgumentException.class, () -> a1.setBodemsoort("  ")); }

    @Test
    void setBodemsoortCorrectShouldNotThrow() {
        assertDoesNotThrow( () -> a1.setBodemsoort("kiezelstenen"));
    }

    /**
     * setWatersoort tests
     */

    @Test
    void setWatersoort() {
        a1.setWatersoort("kiezelstenen");
        assertEquals("kiezelstenen", a1.getWatersoort());
    }

    @Test
    void setWatersoortNullShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> a1.setWatersoort(null));
    }

    @Test
    void setWatersoortEmptyShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> a1.setWatersoort(""));
    }

    @Test
    void setWatersoortBlankShouldThrow() { assertThrows(IllegalArgumentException.class, () -> a1.setWatersoort("  ")); }

    @Test
    void setWatersoortCorrectShouldNotThrow() {
        assertDoesNotThrow( () -> a1.setWatersoort("kiezelstenen"));
    }

    /**
     * setLengte tests
     */

    @Test
    void setLengte() {
        a1.setLengte(77);
        assertEquals(77, a1.getLengte());
    }

    @Test
    void setLengteZeroShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> a1.setLengte(0));
    }

    @Test
    void setLengteCorrectShouldNotThrow() {
        assertDoesNotThrow( () -> a1.setLengte(77));
    }

    /**
     * setBreedte tests
     */

    @Test
    void setBreedte() {
        a1.setBreedte(77);
        assertEquals(77, a1.getBreedte());
    }

    @Test
    void setBreedteZeroShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> a1.setBreedte(0));
    }

    @Test
    void setBreedteCorrectShouldNotThrow() {
        assertDoesNotThrow( () -> a1.setBreedte(77));
    }

    /**
     * setHoogte tests
     */

    @Test
    void setHoogte() {
        a1.setHoogte(77);
        assertEquals(77, a1.getHoogte());
    }

    @Test
    void setHoogteZeroShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> a1.setHoogte(0));
    }

    @Test
    void setHoogteCorrectShouldNotThrow() {
        assertDoesNotThrow( () -> a1.setHoogte(77));
    }
}