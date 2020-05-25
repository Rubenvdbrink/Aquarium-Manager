package nl.hu.bep.model.aquarium;

public class Ornament {
    private String naam;
    private String omschrijving;
    private String kleur;
    private boolean kanOpLuchtpomp;

    /**
     * Constructors
     */

    public Ornament(String naam, String omschrijving, String kleur, boolean kanOpLuchtpomp) {
        this.setNaam(naam);
        this.setOmschrijving(omschrijving);
        this.setKleur(kleur);
        this.kanOpLuchtpomp = kanOpLuchtpomp;
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

    public String getOmschrijving() { return omschrijving; }
    public void setOmschrijving(String omschrijving) {
        if (omschrijving == null || omschrijving.isBlank()) {
            throw new IllegalArgumentException("Niet alle velden zijn correct ingevoerd!");
        }
        this.omschrijving = omschrijving;
    }

    public String getKleur() { return kleur; }
    public void setKleur(String kleur) {
        if (kleur == null || kleur.isBlank()) {
            throw new IllegalArgumentException("Niet alle velden zijn correct ingevoerd!");
        }
        this.kleur = kleur;
    }

    public boolean isKanOpLuchtpomp() { return kanOpLuchtpomp; }
    public void setKanOpLuchtpomp(boolean kanOpLuchtpomp) { this.kanOpLuchtpomp = kanOpLuchtpomp; }
}
