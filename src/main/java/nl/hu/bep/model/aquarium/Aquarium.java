package nl.hu.bep.model.aquarium;

import nl.hu.bep.model.AquariumManager;
import nl.hu.bep.model.bewoners.Bewoner;

import java.util.ArrayList;

public class Aquarium {
    private String naam;
    private int lengte;
    private int breedte;
    private int hoogte;
    private String bodemsoort;
    private String watersoort;

    private ArrayList<Toebehoren> toebehoren;
    private ArrayList<Bewoner> bewoners;
    private ArrayList<Ornament> ornamenten;

    /**
     * Constructors
     */

    public Aquarium(String naam, int lengte, int breedte, int hoogte, String bodemsoort, String watersoort) {
        this.setNaam(naam);
        this.setLengte(lengte);
        this.setBreedte(breedte);
        this.setHoogte(hoogte);
        this.setBodemsoort(bodemsoort);
        this.setWatersoort(watersoort);

        this.toebehoren = new ArrayList<>();
        this.bewoners = new ArrayList<>();
        this.ornamenten = new ArrayList<>();
        AquariumManager.getAlleAquaria().add(this);
    }

    /**
     * Getters and setters
     */

    public String getNaam() { return naam; }
    public void setNaam(String naam) {
        if (naam == null || naam.isBlank()) {
            throw new IllegalArgumentException("Niet alle velden zijn correct ingevoerd!");
        }
        this.naam = naam;
    }

    public int getLengte() { return lengte; }
    public void setLengte(int lengte) {
        if (lengte == 0) {
            throw new IllegalArgumentException("Niet alle velden zijn correct ingevoerd!");
        }
        this.lengte = lengte;
    }

    public int getBreedte() { return breedte; }
    public void setBreedte(int breedte) {
        if (breedte == 0) {
            throw new IllegalArgumentException("Niet alle velden zijn correct ingevoerd!");
        }
        this.breedte = breedte;
    }

    public int getHoogte() { return hoogte; }
    public void setHoogte(int hoogte) {
        if (hoogte == 0) {
            throw new IllegalArgumentException("Niet alle velden zijn correct ingevoerd!");
        }
        this.hoogte = hoogte;
    }

    public String getBodemsoort() { return bodemsoort; }
    public void setBodemsoort(String bodemsoort) {
        if (bodemsoort == null || bodemsoort.isBlank()) {
            throw new IllegalArgumentException("Niet alle velden zijn correct ingevoerd!");
        }
        this.bodemsoort = bodemsoort;
    }

    public String getWatersoort() { return watersoort; }
    public void setWatersoort(String watersoort) {
        if (watersoort == null || watersoort.isBlank()) {
            throw new IllegalArgumentException("Niet alle velden zijn correct ingevoerd!");
        }
        this.watersoort = watersoort;
    }

    public ArrayList<Toebehoren> getToebehoren() { return toebehoren; }

    public ArrayList<Bewoner> getBewoners() { return bewoners; }

    public ArrayList<Ornament> getOrnamenten() { return ornamenten; }

    /**
     * methods
     */
}
