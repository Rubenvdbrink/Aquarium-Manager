package nl.hu.bep.model.aquarium;

import nl.hu.bep.model.AquariumManager;
import nl.hu.bep.model.bewoners.Bewoner;
import nl.hu.bep.model.bewoners.Vis;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.validation.constraints.AssertFalse;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AquariumTest {
    Aquarium aquatest;
    AquariumManager aquaMan;

    @BeforeEach
    void beforeEach() {
        aquaMan = new AquariumManager("Testmanager");
        aquatest = new Aquarium("Bikini Bottom", 100, 100, 50, "zand", "zout");
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
        aquatest.setNaam("Crusty Crab");
        assertEquals("Crusty Crab", aquatest.getNaam());
    }

    @Test
    void setNaamNullShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> aquatest.setNaam(null));
    }

    @Test
    void setNaamEmptyShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> aquatest.setNaam(""));
    }

    @Test
    void setNaamBlankShouldThrow() { assertThrows(IllegalArgumentException.class, () -> aquatest.setNaam("  ")); }

    @Test
    void setNaamCorrectShouldNotThrow() {
        assertDoesNotThrow( () -> aquatest.setNaam("Crusty Crab"));
    }

    /**
     * setBodemsoort tests
     */

    @Test
    void setBodemsoort() {
        aquatest.setBodemsoort("kiezelstenen");
        assertEquals("kiezelstenen", aquatest.getBodemsoort());
    }

    @Test
    void setBodemsoortNullShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> aquatest.setBodemsoort(null));
    }

    @Test
    void setBodemsoortEmptyShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> aquatest.setBodemsoort(""));
    }

    @Test
    void setBodemsoortBlankShouldThrow() { assertThrows(IllegalArgumentException.class, () -> aquatest.setBodemsoort("  ")); }

    @Test
    void setBodemsoortCorrectShouldNotThrow() {
        assertDoesNotThrow( () -> aquatest.setBodemsoort("kiezelstenen"));
    }

    /**
     * setWatersoort tests
     */

    @Test
    void setWatersoort() {
        aquatest.setWatersoort("kiezelstenen");
        assertEquals("kiezelstenen", aquatest.getWatersoort());
    }

    @Test
    void setWatersoortNullShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> aquatest.setWatersoort(null));
    }

    @Test
    void setWatersoortEmptyShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> aquatest.setWatersoort(""));
    }

    @Test
    void setWatersoortBlankShouldThrow() { assertThrows(IllegalArgumentException.class, () -> aquatest.setWatersoort("  ")); }

    @Test
    void setWatersoortCorrectShouldNotThrow() {
        assertDoesNotThrow( () -> aquatest.setWatersoort("kiezelstenen"));
    }

    /**
     * setLengte tests
     */

    @Test
    void setLengte() {
        aquatest.setLengte(77);
        assertEquals(77, aquatest.getLengte());
    }

    @Test
    void setLengteZeroShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> aquatest.setLengte(0));
    }

    @Test
    void setLengteCorrectShouldNotThrow() {
        assertDoesNotThrow( () -> aquatest.setLengte(77));
    }

    /**
     * setBreedte tests
     */

    @Test
    void setBreedte() {
        aquatest.setBreedte(77);
        assertEquals(77, aquatest.getBreedte());
    }

    @Test
    void setBreedteZeroShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> aquatest.setBreedte(0));
    }

    @Test
    void setBreedteCorrectShouldNotThrow() {
        assertDoesNotThrow( () -> aquatest.setBreedte(77));
    }

    /**
     * setHoogte tests
     */

    @Test
    void setHoogte() {
        aquatest.setHoogte(77);
        assertEquals(77, aquatest.getHoogte());
    }

    @Test
    void setHoogteZeroShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> aquatest.setHoogte(0));
    }

    @Test
    void setHoogteCorrectShouldNotThrow() {
        assertDoesNotThrow( () -> aquatest.setHoogte(77));
    }

    /**
     * addBewoner tests
     */

    @Test
    void addBewonerAlreadyExistsShouldBeFalse() {
        Vis v1 = new Vis("bla", "bla", 5, true, true, true);
        aquatest.addBewoner(v1);
        assertFalse(aquatest.addBewoner(v1));
    }

    @Test
    void addBewonerShouldBeTrue() {
        Vis v1 = new Vis("bla", "bla", 5, true, true, true);
        assertTrue(aquatest.addBewoner(v1));
    }

    /**
     * addToebehoren tests
     */

    @Test
    void addToebehorenAlreadyExistsShouldBeFalse() {
        Filter f1 = new Filter("awdwad", 283792, true, 50);
        aquatest.addToebehoren(f1);
        assertFalse(aquatest.addToebehoren(f1));
    }

    @Test
    void addToebehorenShouldBeTrue() {
        Filter f1 = new Filter("awdwad", 283792, true, 50);
        assertTrue(aquatest.addToebehoren(f1));
    }

    /**
     * addOrnament tests
     */

    @Test
    void addOrnamentAlreadyExistsShouldBeFalse() {
        Ornament o1 = new Ornament("wad", "wadawd", "wadwad", true);
        aquatest.addOrnament(o1);
        assertFalse(aquatest.addOrnament(o1));
    }

    @Test
    void addOrnamentShouldBeTrue() {
        Ornament o1 = new Ornament("wad", "wadawd", "wadwad", true);
        assertTrue(aquatest.addOrnament(o1));
    }
}