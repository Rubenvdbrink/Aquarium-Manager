package nl.hu.bep.model.personen;

import nl.hu.bep.model.aquarium.Aquarium;
import nl.hu.bep.model.AquariumManager;

import java.util.ArrayList;

public class Eigenaar {
    private String voornaam;
    private String achternaam;

    private ArrayList<Aquarium> eigenAquaria;

    /**
     * Constructors
     */

    public Eigenaar(String voornaam, String achternaam) {
        this.setVoornaam(voornaam);
        this.setAchternaam(achternaam);
        this.eigenAquaria = new ArrayList<>();
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

    public ArrayList<Aquarium> getEigenAquaria() { return eigenAquaria; }
}
