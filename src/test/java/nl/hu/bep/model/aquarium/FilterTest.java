package nl.hu.bep.model.aquarium;

import io.netty.util.internal.ThreadExecutorMap;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilterTest {
    Filter f1;

    /**
     * Methods from superclass already tested in VerlichtingTest
     */

    @BeforeEach
    void beforeEach() {
        f1 = new Filter("555T", 777, false, 50);
    }

    /**
     * Constructor tests
     */

    @Test
    void newFilterAantalLiterZeroShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Filter("555T", 777, false, 0));
    }

    @Test
    void newFilterCorrectShouldNotThrow() {
        assertDoesNotThrow( () -> new Filter("555T", 777, false, 50));
    }

    /**
     * setExtern tests
     */

    @Test
    void setExtern() {
        f1.setExtern(true);
        assertEquals(true, f1.isExtern());
    }

    /**
     * setAantalLiter tests
     */

    @Test
    void setAantalLiter() {
        f1.setAantalLiter(920);
        assertEquals(920, f1.getAantalLiter());
    }

    @Test
    void setAantalLiterZeroShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> f1.setAantalLiter(0));
    }
}