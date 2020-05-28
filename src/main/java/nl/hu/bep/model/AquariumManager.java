package nl.hu.bep.model;

import nl.hu.bep.model.aquarium.Aquarium;
import nl.hu.bep.model.aquarium.Toebehoren;
import nl.hu.bep.model.bewoners.Bewoner;
import nl.hu.bep.model.personen.Eigenaar;

import java.util.ArrayList;

public class AquariumManager {
    private String installatienaam;

    private static ArrayList<Eigenaar> alleEigenaren;
    private static ArrayList<Toebehoren> alleToebehoren;
    private static ArrayList<Aquarium> alleAquaria;
    private static ArrayList<Bewoner> alleBewoners;

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

    public static ArrayList<Eigenaar> getAlleEigenaren() { return alleEigenaren; }

    public static ArrayList<Toebehoren> getAlleToebehoren() { return alleToebehoren; }

    public static ArrayList<Aquarium> getAlleAquaria() { return alleAquaria; }

    public static ArrayList<Bewoner> getAlleBewoners() { return alleBewoners; }

    /**
     * Methods
     */

}
