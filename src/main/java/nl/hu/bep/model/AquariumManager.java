package nl.hu.bep.model;

import nl.hu.bep.model.aquarium.Aquarium;
import nl.hu.bep.model.aquarium.Toebehoren;
import nl.hu.bep.model.bewoners.Bewoner;

import java.util.ArrayList;
import java.util.Collections;

public class AquariumManager {
    private String installatienaam;

    private ArrayList<Eigenaar> alleEigenaren;
    private ArrayList<Toebehoren> alleToebehoren;
    private ArrayList<Aquarium> alleAquaria ;
    private ArrayList<Bewoner> alleBewoners;

    /**
     * Constructors
     */

    public AquariumManager(String installatienaam) {
        this.setInstallatienaam(installatienaam);
        this.alleEigenaren = new ArrayList<>();
        this.alleToebehoren = new ArrayList<>();
        this.alleAquaria = new ArrayList<>();
        this.alleBewoners = new ArrayList<>();
    }

    /**
     * Getters and setters
     */

    public String getInstallatienaam() { return installatienaam; }
    public void setInstallatienaam(String installatienaam) {
        if (installatienaam == null || installatienaam.isBlank()) {
            throw new IllegalArgumentException("Niet alle velden zijn correct ingevoerd!");
        }
        this.installatienaam = installatienaam;
    }

    public ArrayList<Eigenaar> getAlleEigenaren() { return alleEigenaren; }

    public ArrayList<Toebehoren> getAlleToebehoren() { return alleToebehoren; }

    public ArrayList<Aquarium> getAlleAquaria() { return alleAquaria; }

    public ArrayList<Bewoner> getAlleBewoners() { return alleBewoners; }
}
