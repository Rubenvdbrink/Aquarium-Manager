package nl.hu.bep.model.aquarium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThermostaatTest {
    Thermostaat t1;

    /**
     * Methods from superclass already tested in VerlichtingTest
     */

    @BeforeEach
    void beforeEach() {
        t1 = new Thermostaat("320X", 888, 20, 50, 35);
    }

    /**
     * Constructor tests
     */

    @Test
    void newThermostaatMinTempSmallerThanMinTempShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Thermostaat("320X", 888, 0, 70, 35));
    }

    @Test
    void newThermostaatMaxTempBiggerThanMaxTempShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Thermostaat("320X", 888, 10, 120, 35));
    }

    @Test
    void newThermostaatMinTempBiggerThanMaxTempShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Thermostaat("320X", 888, 40, 20, 35));
    }

    @Test
    void newThermostaatHuidigeTempIngesteldUnderMinTempShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Thermostaat("320X", 888, 20, 50, 10));
    }

    @Test
    void newThermostaatHuidigeTempIngesteldAboceMaxTempShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Thermostaat("320X", 888, 20, 50, 60));
    }

    @Test
    void newThermostaatCorrectShouldNotThrow() {
        assertDoesNotThrow( () -> new Thermostaat("320X", 888, 20, 50, 35));
    }

    /**
     * setMinTemp tests
     */

    @Test
    void setMinTemp() {
        t1.setMinTemp(10);
        assertEquals(10, t1.getMinTemp());
    }

    @Test
    void setMinTempSmallerThanMinTempShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> t1.setMinTemp(0));
    }

    @Test
    void setMinTempBiggerThanMaxTempShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> t1.setMinTemp(80));
    }

    @Test
    void setMinTempCorrectShouldNotThrow() {
        assertDoesNotThrow( () -> t1.setMinTemp(25));
    }

    /**
     * setMaxTemp tests
     * Some testcases already tested in setMinTemp
     */

    @Test
    void setMaxTempBiggerThanMaxTempShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> t1.setMaxTemp(101));
    }

    @Test
    void setMaxTempCorrectShouldNotThrow() {
        assertDoesNotThrow( () -> t1.setMaxTemp(45));
    }

    /**
     * setHuidigeTempIngesteld test
     */

    @Test
    void setHuidigeTempIngesteldBiggerThanMaxTempShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> t1.setHuidigeTempIngesteld(51));
    }

    @Test
    void setHuidigeTempIngesteldSmallerThanMinTempShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> t1.setHuidigeTempIngesteld(19));
    }

    @Test
    void setHuidigeTempIngesteldCorrectShouldNotThrow() {
        assertDoesNotThrow( () -> t1.setMaxTemp(30));
    }
}