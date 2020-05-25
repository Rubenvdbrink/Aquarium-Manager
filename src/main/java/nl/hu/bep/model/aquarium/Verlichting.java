package nl.hu.bep.model.aquarium;

public class Verlichting extends Toebehoren {
    private boolean isLed;
    private int tijdAan;
    private int tijdUit;

    /**
     * Constructors
     */

    public Verlichting(String model, int serienummer, boolean isLed, int tijdAan, int tijdUit) {
        super(model, serienummer);
        this.setLed(isLed);
        this.setTijdAan(tijdAan);
        this.setTijdUit(tijdUit);
    }

    /**
     * Getters and setters
     */

    public boolean isLed() { return isLed; }
    public void setLed(boolean led) { isLed = led; }

    public int getTijdAan() { return tijdAan; }
    public void setTijdAan(int tijdAan) {
        if (tijdAan == 0) {
            throw new IllegalArgumentException("Niet alle velden zijn correct ingevoerd!");
        }
        this.tijdAan = tijdAan;
    }

    public int getTijdUit() { return tijdUit; }
    public void setTijdUit(int tijdUit) {
        if (tijdUit == 0) {
            throw new IllegalArgumentException("Niet alle velden zijn correct ingevoerd!");
        }
        this.tijdUit = tijdUit;
    }
}
