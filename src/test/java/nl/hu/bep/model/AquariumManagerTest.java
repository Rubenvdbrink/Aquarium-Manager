package nl.hu.bep.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AquariumManagerTest {
    AquariumManager a1;

    @BeforeEach
    void beforeEach() {
        a1 = new AquariumManager("installatienaam");
    }

    /**
     * Constructor tests
     */

    @Test
    void newAquariumManagerInstallatienaamNullShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new AquariumManager(null));
    }

    @Test
    void newAquariumManagerInstallatienaamEmptyShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new AquariumManager(""));
    }

    @Test
    void newAquariumManagerInstallatienaamBlankShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new AquariumManager(" "));
    }

    @Test
    void newAquariumManagerInstallatienaamCorrectShouldNotThrow() {
        assertDoesNotThrow( () -> new AquariumManager("installatienaam"));
    }

    /**
     * setInstallatienaam tests
     */

    @Test
    void setInstallatienaam() {
        a1.setInstallatienaam("nieuwenaam");
        assertEquals("nieuwenaam", a1.getInstallatienaam());
    }

    @Test
    void setInstallatienaamNullShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> a1.setInstallatienaam(null));
    }

    @Test
    void setInstallatienaamEmptyShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> a1.setInstallatienaam(""));
    }

    @Test
    void setInstallatienaamBlankShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> a1.setInstallatienaam(" "));
    }

    @Test
    void setInstallatienaamCorrectInputShouldNotThrow() {
        assertDoesNotThrow( () -> a1.setInstallatienaam("nieuwenaam"));
    }

    /**
     * getInstallatienaam tests
     */

    @Test
    void getInstallatienaam() {
        assertEquals("installatienaam", a1.getInstallatienaam());
    }
}
