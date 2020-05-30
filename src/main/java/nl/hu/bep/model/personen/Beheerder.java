package nl.hu.bep.model.personen;

public class Beheerder extends Eigenaar {

    public Beheerder(String username, String plainpassword, String voornaam, String achternaam) {
        super(username, plainpassword, voornaam, achternaam);
        this.setAdmin();
    }
}
