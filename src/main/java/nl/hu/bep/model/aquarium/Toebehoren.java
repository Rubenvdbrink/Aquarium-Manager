package nl.hu.bep.model.aquarium;

public abstract class Toebehoren {
    protected String model;
    protected int serienummer;

    /**
     * Constructors
     */

    public Toebehoren(String model, int serienummer) {
        this.setModel(model);
        this.setSerienummer(serienummer);
    }

    /**
     * Getters and setters
     */

    public String getModel() { return model; }
    public void setModel(String model) {
        if (model == null || model.isBlank()) {
            throw new IllegalArgumentException("Niet alle velden zijn correct ingevoerd!");
        }
        this.model = model;
    }

    public int getSerienummer() { return serienummer; }
    public void setSerienummer(int serienummer) {
        if (serienummer == 0) {
            throw new IllegalArgumentException("Niet alle velden zijn correct ingevoerd!");
        }
        this.serienummer = serienummer;
    }
}
