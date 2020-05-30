package nl.hu.bep.model.personen;

import nl.hu.bep.model.aquarium.Aquarium;
import nl.hu.bep.model.AquariumManager;

import java.util.ArrayList;

public class Eigenaar extends MyUser{
    private String voornaam;
    private String achternaam;

    private ArrayList<Aquarium> eigenAquaria;

    /**
     * Constructors
     */

    public Eigenaar(String username, String plainpassword, String voornaam, String achternaam) {
        super(username, plainpassword);
        this.setVoornaam(voornaam);
        this.setAchternaam(achternaam);
        this.eigenAquaria = new ArrayList<>();
        if(!AquariumManager.getAlleEigenaren().contains(this)) {
            AquariumManager.getAlleEigenaren().add(this);
        }
    }

    /**
     * Getters and setters
     */

    public String getVoornaam() { return voornaam; }
    public void setVoornaam(String voornaam) {
        if (voornaam == null || voornaam.isBlank()) {
            throw new IllegalArgumentException("Niet alle velden zijn correct ingevoerd!");
        }
        this.voornaam = voornaam;
    }

    public String getAchternaam() { return achternaam; }
    public void setAchternaam(String achternaam) {
        if (achternaam == null || achternaam.isBlank()) {
            throw new IllegalArgumentException("Niet alle velden zijn correct ingevoerd!");
        }
        this.achternaam = achternaam;
    }

    public boolean addAquarium(Aquarium aquarium) {
        if (!this.eigenAquaria.contains(aquarium)) {
            eigenAquaria.add(aquarium);
            return true;
        }
        return false;
    }

    public ArrayList<Aquarium> getEigenAquaria() { return eigenAquaria; }
}
