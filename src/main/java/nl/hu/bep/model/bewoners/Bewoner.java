package nl.hu.bep.model.bewoners;

public abstract class Bewoner {
    protected String soortnaam;
    protected String kleurnaam;
    protected int aantal;
    protected boolean groepsDier;

    /**
     * Constructors
     */

    public Bewoner(String soortnaam, String kleurnaam, int aantal, boolean groepsDier) {
        this.setSoortnaam(soortnaam);
        this.setKleurnaam(kleurnaam);
        this.setAantal(aantal);
        this.setGroepsDier(groepsDier);
    }

    /**
     * Getters and setters
     */

    public String getSoortnaam() { return soortnaam; }
    public void setSoortnaam(String soortnaam) {
        if (soortnaam == null || soortnaam.isBlank()) {
            throw new IllegalArgumentException("Niet alle velden zijn correct ingevoerd!");
        }
        this.soortnaam = soortnaam;
    }

    public String getKleurnaam() { return kleurnaam; }
    public void setKleurnaam(String kleurnaam) {
        if (kleurnaam == null || kleurnaam.isBlank()) {
            throw new IllegalArgumentException("Niet alle velden zijn correct ingevoerd!");
        }
        this.kleurnaam = kleurnaam;
    }

    public int getAantal() { return aantal; }
    public void setAantal(int aantal) {
        if (aantal == 0) {
            throw new IllegalArgumentException("Niet alle velden zijn correct ingevoerd!");
        }
        this.aantal = aantal;
    }

    public boolean isGroepsDier() { return groepsDier; }
    public void setGroepsDier(boolean groepsDier) { this.groepsDier = groepsDier; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bewoner bewoner = (Bewoner) o;

        if (soortnaam != null ? !soortnaam.equals(bewoner.soortnaam) : bewoner.soortnaam != null) return false;
        return kleurnaam != null ? kleurnaam.equals(bewoner.kleurnaam) : bewoner.kleurnaam == null;
    }
}
