package nl.hu.bep.model;

import nl.hu.bep.model.aquarium.Aquarium;
import nl.hu.bep.model.aquarium.Toebehoren;
import nl.hu.bep.model.bewoners.Bewoner;

import java.util.ArrayList;

public class AquariumManager {
    private String installatienaam;

    private ArrayList<Eigenaar> alleEigenaren = new ArrayList<>();
    private ArrayList<Toebehoren> alleToebehoren = new ArrayList<>();
    private ArrayList<Aquarium> alleAquaria = new ArrayList<>();
    private ArrayList<Bewoner> alleBewoners = new ArrayList<>();

    /**
     * Getters and setters
     */
    
    public String getInstallatienaam() { return installatienaam; }
    public void setInstallatienaam(String installatienaam) { this.installatienaam = installatienaam; }

    public ArrayList<Eigenaar> getAlleEigenaren() { return alleEigenaren; }
    public void setAlleEigenaren(ArrayList<Eigenaar> alleEigenaren) { this.alleEigenaren = alleEigenaren; }

    public ArrayList<Toebehoren> getAlleToebehoren() { return alleToebehoren; }
    public void setAlleToebehoren(ArrayList<Toebehoren> alleToebehoren) { this.alleToebehoren = alleToebehoren; }

    public ArrayList<Aquarium> getAlleAquaria() { return alleAquaria; }
    public void setAlleAquaria(ArrayList<Aquarium> alleAquaria) { this.alleAquaria = alleAquaria; }

    public ArrayList<Bewoner> getAlleBewoners() { return alleBewoners; }
    public void setAlleBewoners(ArrayList<Bewoner> alleBewoners) { this.alleBewoners = alleBewoners; }
}

