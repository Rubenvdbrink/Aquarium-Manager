package nl.hu.bep.model.aquarium;

import nl.hu.bep.model.bewoners.Bewoner;

import java.util.ArrayList;

public class Aquarium {
    private String naam;
    private int lengte;
    private int breedte;
    private int hoogte;
    private String bodemsoort;
    private String watersoort;

    private ArrayList<Toebehoren> toebehoren = new ArrayList<>();
    private ArrayList<Bewoner> bewoners = new ArrayList<>();
    private ArrayList<Ornament> ornamenten = new ArrayList<>();
}
