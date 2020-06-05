package nl.hu.bep.model.bewoners;

import nl.hu.bep.model.AquariumManager;

public class Kreeft extends Bewoner {
    private boolean algEtend;
    private boolean vereistSpeciaalVisVoer;

    /**
     * Constructors
     */

    public Kreeft(String soortnaam, String kleurnaam, int aantal, boolean groepsDier) {
        super(soortnaam, kleurnaam, aantal, groepsDier);
        AquariumManager.getAlleBewoners().add(this);
    }
}
