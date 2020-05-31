package nl.hu.bep.model.personen;

import nl.hu.bep.model.AquariumManager;

public class Beheerder extends Eigenaar {

    public Beheerder(String username, String plainpassword, String voornaam, String achternaam) {
        super(username, plainpassword, voornaam, achternaam);
        this.setAdmin();
    }

    /**
     * Methods
     */

    public boolean removeEigenaar(MyUser user) {
        if (user instanceof Eigenaar) {
           if(AquariumManager.getAlleEigenaren().contains(user)) {
               AquariumManager.getAlleEigenaren().remove(user);
               user = null;
               return true;
           }
        }
        return false;
    }
}
