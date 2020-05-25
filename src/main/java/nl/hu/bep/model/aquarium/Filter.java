package nl.hu.bep.model.aquarium;

public class Filter extends Toebehoren{
    private boolean isExtern;
    private int aantalLiter;

    /**
     * Constructors
     */

    public Filter(String model, int serienummer, boolean isExtern, int aantalLiter) {
        super(model, serienummer);
        this.isExtern = isExtern;
        this.setAantalLiter(aantalLiter);
    }

    /**
     * Getters and setters
     */

    public boolean isExtern() { return isExtern; }
    public void setExtern(boolean extern) {
        isExtern = extern;
    }

    public int getAantalLiter() {
        return aantalLiter;
    }
    public void setAantalLiter(int aantalLiter) {
        if (aantalLiter == 0) {
            throw new IllegalArgumentException("Niet alle velden zijn correct ingevoerd!");
        }
        this.aantalLiter = aantalLiter;
    }
}
