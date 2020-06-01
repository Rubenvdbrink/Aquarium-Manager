package nl.hu.bep.model.personen;

import nl.hu.bep.model.AquariumManager;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeheerderTest {

    /**
     * removeEigenaar tests
     */

    @Test
    void removeBeheerderShouldBeFalse() {
        AquariumManager aquaman = new AquariumManager("aquaman");
        Beheerder b1 = new Beheerder("henk", "1234", "HENK", "tenk");
        Beheerder b2 = new Beheerder("henk2", "12234", "HE2NK", "ten2k");
        assertFalse(b1.removeEigenaar(b2));
    }

    @Test
    void removeEigenaarShouldBeTrue() {
        AquariumManager aquaman = new AquariumManager("aquaman");
        Beheerder b1 = new Beheerder("henk", "1234", "HENK", "tenk");
        Eigenaar e1 = new Eigenaar("henk2", "12234", "HE2NK", "ten2k");
        assertTrue(b1.removeEigenaar(e1));
    }

}