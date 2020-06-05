package nl.hu.bep.model.bewoners;

import nl.hu.bep.model.AquariumManager;

public class Garnaal extends Bewoner{
    String garnaal;

    /**
     * Constructors
     */

    public Garnaal(String soortnaam, String kleurnaam, int aantal, boolean groepsDier) {
        super(soortnaam, kleurnaam, aantal, groepsDier);
        AquariumManager.getAlleBewoners().add(this);
    }
}
